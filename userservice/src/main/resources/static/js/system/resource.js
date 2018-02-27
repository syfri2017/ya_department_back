new Vue({
    el: '#app',
    data: function() {
        return {
            visible: false,
            tableheight: 445,//表高度变量
            permissionVisible: false,
            //资源权限列表
            permissionDetailList: [],
            //查看详情时选中的资源
            permissionDetailSelect: [],
            //查询表单
            searchForm: {
                resourceinfo: '',
                createTimeBegin: '',
                createTimeEnd: ''
            },
            //表数据
            tableData: [],
            //后台返回全部资源列表
            allPermissionList:[],
            defaultKeys: ['17'],

            //删除成功后台返回数据
            delStatus: "success",
            //显示加载中样
            loading: false,
            labelPosition: 'right',
            //多选值
            multipleSelection: [],
            //当前页
            currentPage: 1,
            //分页大小
            pageSize: 10,
            //总记录数
            total: 10,
            //序号
            indexData: 0,
            //资源列表是否显示
            permissionVisible: false,
            //删除的弹出框
            deleteVisible: false,
            //新建页面是否显示
            addFormVisible: false,
            addLoading: false,
            addFormRules: {
                resourcename: [{ required: true, message: "请输入资源名称", trigger: "blur" }],
                resourceinfo: [{ required: true, message: "请输入资源描述", trigger: "blur" }]
            },
            //新建数据
            allFirstResource: [],
            allSecondResource: [],
            addForm:{
                resourcename: '',
                resourceinfo: '',
                parentid1: '',
                parentid2: '',
                permissions: []
            },
            //选中的序号
            selectIndex: -1,
            //修改界面是否显示
            editFormVisible: false,
            editLoading: false,
            editFormRules: {
                resourcename: [{ required: true, message: "请输入资源名称", trigger: "blur" }],
                resourceinfo: [{ required: true, message: "请输入资源描述", trigger: "blur" }]
            },
            //修改界面数据
            editForm: {
                resourceid: '',
                resourcename: '',
                resourceinfo: '',
                parentid1: '',
                parentid2: '',
                permissions: []
            },
            editFormSelect: [],
            //角色对应资源
            resourceList:[],
            count: 1,

        }
    },
    created: function () {
        this.searchClick("-1");
    },
    methods:{

        getAllPermissions: function(){
            axios.get('/permission/getAll').then(function(res){
                this.allPermissionList = res.data.result;
            }.bind(this),function (error) {
                console.log(error);
            })
        },

        //日期控件变化时格式化
        begindateChange(val) {
            this.searchForm.createTimeBegin = val;
        },
        enddateChange(val) {
            this.searchForm.createTimeEnd = val;
        },

        //表格中日期格式化
        dateFormat: function(row, column){
            var rowDate = row[column.property];
            if(rowDate == null || rowDate == ""){
                return '';
            }else{
                var date = new Date(rowDate);
                if(date == undefined){
                    return '';
                }
                var month = '' + (date.getMonth() + 1),
                    day = '' + date.getDate(),
                    year = date.getFullYear();

                if (month.length < 2) month = '0' + month;
                if (day.length < 2) day = '0' + day;

                return [year, month, day].join('-')
            }
        },

        //获取第一父资源
        getFirstResource: function () {
            axios.get('/resource/getParentResource').then(function(res){
                this.allFirstResource = res.data.result;
            }.bind(this),function (error) {
                console.log(error);
            })
        },
        //获取第二父资源
        getSecondResource(val) {
            var parentid = val;
            this.editForm.parentid2 = '';
            axios.get('/resource/getParentResource/' + parentid).then(function(res){
                this.allSecondResource = res.data.result;
            }.bind(this),function (error) {
                console.log(error);
            })
        },
        resourcenameCilck(val){
            this.searchClick(val.resourceid)
        },

        //查询，初始化
        searchClick(parentid) {
            var _self = this;
            if(this.searchForm.createTimeBegin!="" && this.searchForm.createTimeEnd!="" && this.searchForm.createTimeBegin>this.searchForm.createTimeEnd){
                _self.$message({
                    message: "时间选择错误！",
                    type: "error"
                });
                return;
            }
            var params = {
                parentid: parentid,
                resourceinfo: this.searchForm.resourceinfo,
                createTimeBegin: this.searchForm.createTimeBegin,
                createTimeEnd: this.searchForm.createTimeEnd
            };

            axios.post('/resource/findByVO', params).then(function(res){
                this.tableData = res.data.result;
                this.total = res.data.result.length;
            }.bind(this),function(error){
                console.log(error)
            })
        },

        //资源详情
        permissionDetails: function(id){
            var _self = this;
            _self.permissionVisible=true;
            axios.get('/permission/getPermission/' + id).then(function(res){
                this.permissionDetailList = res.data.result;
                for(var i=0;i<this.permissionDetailList.length;i++){
                    this.permissionDetailSelect.push(this.permissionDetailList[i].permissioninfo);
                }
            }.bind(this),function(error){
                console.log(error)
            })

        },

        handleNodeClick(data) {
            console.log(data);
        },

        //表格勾选事件
        selectionChange: function(val) {
            this.multipleSelection = val;
        },

        //表格重新加载数据
        loadingData: function() {
            var _self = this;
            _self.loading = true;
            setTimeout(function() {
                console.info("加载数据成功");
                _self.loading = false;
            }, 300);
        },

        //新建：弹出Dialog
        addClick: function() {
            var _self = this;
            _self.addFormVisible = true;
            this.getAllPermissions();
            this.getFirstResource();
        },
        //新建：提交
        addSubmit: function(val) {
            var _self = this;
            var param = {
                resourcename: this.addForm.resourcename
            }
            axios.post('/resource/getNum', param).then(function(res){
                if(res.data.result != 0){
                    _self.$message({
                        message: "资源名已存在!",
                        type: "error"
                    });
                }else{
                    var params = {
                        resourcename: val.resourcename,
                        resourceinfo: val.resourceinfo,
                        parentid: val.parentid1=="" ? '-1' : (val.parentid2=="" ? val.parentid1 : val.parentid2),
                        permissions: val.permissions
                    }

                    axios.post('/resource/insertByVO', params).then(function(res){
                        var addData = res.data.result;
                        addData.createTime = new Date();
                        _self.tableData.unshift(addData);
                        _self.total = _self.tableData.length;
                    }.bind(this),function(error){
                        console.log(error)
                    })
                    this.addFormVisible = false;
                    _self.loadingData();//重新加载数据
                }
            }.bind(this),function(error){
                console.log(error)
            })
        },

        //删除：批量删除
        removeSelection: function() {
            debugger;
            var _self = this;
            var multipleSelection = this.multipleSelection;
            if (multipleSelection.length < 1) {
                _self.$message({
                    message: "请至少选中一条记录",
                    type: "error"
                });
                return;
            }
            var ids = [];
            for (var i = 0; i < multipleSelection.length; i++) {
                var row = multipleSelection[i];
                ids.push(row.resourceid);
            }
            this.$confirm("确认删除吗？", "提示", {type: "warning"})
                .then(function() {
                    var params = {
                        ids: ids
                    }
                    axios.post('/resource/deleteByIds', params).then(function(res){
                        for(var d =0;d< ids.length;d++){
                            for(var k=0;k< _self.tableData.length;k++) {
                                if(_self.tableData[k].resourceid == ids[d]){
                                    _self.tableData.splice(k,1);
                                }
                            }
                        }
                        _self.$message({
                            message: "删除成功",
                            type: "success"
                        });
                        _self.total = _self.tableData.length;
                        _self.loadingData(); //重新加载数据
                    }.bind(this),function(error){
                        console.log(error)
                    })

                })
                .catch(function(e) {
                    if (e != "cancel") console.log("出现错误：" + e);
                });
        },
        //分页大小修改事件
        pageSizeChange: function(val) {
            console.log("每页 " + val + " 条");
            this.pageSize = val;
            var _self = this;
            _self.loadingData(); //重新加载数据
        },
        //当前页修改事件
        currentPageChange: function(val) {
            this.currentPage = val;
            console.log("当前页: " + val);
            var _self = this;
            _self.loadingData(); //重新加载数据
        },

        //修改：弹出Dialog
        editClick: function() {
            var _self = this;
            var multipleSelection = this.multipleSelection;
            if (multipleSelection.length < 1) {
                _self.$message({
                    message: "请至少选中一条记录",
                    type: "error"
                });
                return;
            }
            else if(multipleSelection.length>1){
                _self.$message({
                    message:"只能选一条记录进行编辑",
                    type:"error"
                });
                return;
            }
            var resourceid = multipleSelection[0].resourceid;
            //获取选择的行号
            for(var k=0;k< _self.tableData.length;k++) {
                if(_self.tableData[k].resourceid == resourceid){
                    _self.selectIndex = k;
                }
            }
            this.editForm.resourceid = multipleSelection[0].resourceid;
            this.editForm.resourcename = multipleSelection[0].resourcename;
            this.editForm.resourceinfo = multipleSelection[0].resourceinfo;
            this.editForm.permissions = multipleSelection[0].permissions;
            // this.editForm = Object.assign({}, _self.tableData[_self.selectIndex]);
            this.getAllPermissions();
            this.getFirstResource();

            var parentid = _self.tableData[_self.selectIndex].parentid;
            if(parentid == '-1'){

            }else{
                axios.get('/resource/getParentid/' + parentid).then(function(res){
                    var tempParentid = res.data.result;
                    if(tempParentid == '-1111'){
                        this.editForm.parentid1 = parentid;
                    }else{
                        this.editForm.parentid1 = tempParentid;
                        this.editForm.parentid2 = parentid;
                    }
                }.bind(this),function(error){
                    console.log(error)
                })
            }

            //权限的选中
            this.editFormSelect = [];
            for(var i=0;i<this.editForm.permissions.length;i++){
                this.editFormSelect.push(this.editForm.permissions[i].permissionid);
            }
            this.editFormVisible = true;
        },

        //获取复选框选中值
        getCheckValue(val){
            this.editFormSelect = val;
        },

        //修改：保存按钮
        editSubmit: function(val) {
            val.permissions = [];
            for(var i=0;i<this.editFormSelect.length;i++){
                var temp = {permissionid : this.editFormSelect[i]};
                val.permissions.push(temp);
            }
            var params = {
                resourceid: val.resourceid,
                resourcename: val.resourcename,
                resourceinfo: val.resourceinfo,
                parentid: val.parentid1=="" ? '-1' : (val.parentid2=="" ? val.parentid1 : val.parentid2),
                permissions: val.permissions
            };
            axios.post('/resource/updateByVO', params).then(function(res){
                this.tableData[this.selectIndex].resourcename = val.resourcename;
                this.tableData[this.selectIndex].resourceinfo = val.resourceinfo;
                this.tableData[this.selectIndex].alterName = res.data.result.alterName;
                this.tableData[this.selectIndex].alterTime = new Date();
                this.tableData[this.selectIndex].permissions = val.permissions;
            }.bind(this),function(error){
                console.log(error)
            })
            this.editFormVisible = false;
        },

        closeDialog:function(val){
            this.addFormVisible = false;
            val.resourcename = '';
            val.resourceinfo = '';
            val.parentid1 = '';
            val.parentid2 = '';
            this.$refs["addForm"].resetFields();
        },
        closePermissionDialog:function(){
            this.permissionVisible=false;
        }
    },

})