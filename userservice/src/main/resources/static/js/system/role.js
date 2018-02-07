new Vue({
    el: '#app',
    data: function() {
        return {
            visible: false,
            //角色下拉框
            allRoles: [],
            //查询表单
            searchForm: {
                rolename:'',
                createTimeBegin: '',
                createTimeEnd: ''
            },
            //表数据
            tableData: [],
            //后台返回全部资源列表
            allResourceList:[],

            //删除成功后台返回数据
            delStatus:"success",
            countryList:['法国','英国','德国'],
            cityList:[['巴黎','普罗旺斯',"马赛"],['伦敦','爱丁堡',"北爱尔兰"],['柏林','慕尼黑',"汉堡"]],
            rowdata:'',
            //表高度变量
            tableheight :440,
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
            total:10,
            //行数据保存
            rowdata:{

            },
            //序号
            indexData:0,
            //资源列表是否显示
            resourceVisible:false,
            //删除的弹出框
            deleteVisible: false,
            //新建页面是否显示
            addFormVisible:false,
            addLoading:false,
            addFormRules:{
                rolename: [{ required: true, message: "请输入角色名称", trigger: "blur" }],
                roleinfo: [{ required: true, message: "请输入角色描述", trigger: "blur" }]
            },
            //新建数据
            addForm:{
                rolename:"",
                roleinfo: "",
                resource:[]
            },
            //选中的序号
            selectIndex: -1,
            //修改界面是否显示
            editFormVisible: false,
            editLoading: false,
            editFormRules: {
                rolename: [{ required: true, message: "请输入角色名称", trigger: "blur" }]
            },
            //修改界面数据
            editForm: {
                roleid:"",
                rolename:"",
                roleinfo: "",
                create_name:"",
                create_time:"",
                alter_name:"",
                alter_time:"",
                resource:[]
            },

            //树结构配置
            defaultProps: {
                children: 'children',
                label: 'menuName'
            },

            //角色对应资源
            resourceList:[],

            //新修改页面的复选树
            checkprops: {
                label: 'name',
                children: 'zones'
            },
            count: 1,

        }
    },
    created: function () {
        this.getAllRoles();
        this.searchClick();
    },
    methods:{
        //所有的角色列表
        getAllRoles: function(){
            axios.get('/role/getAll').then(function(res){
                this.allRoles = res.data.result;
            }.bind(this),function(error){
                console.log(error);
            })
        },
        getAllResources: function(){
            axios.get('/resource/getAll').then(function(res){
                this.allResourceList = res.data.result;
                console.log(1111);
                console.log(this.allResourceList);
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

        //查询，初始化
        searchClick: function() {
            var _self = this;
            if(this.searchForm.createTimeBegin!="" && this.searchForm.createTimeEnd!="" && this.searchForm.createTimeBegin>this.searchForm.createTimeEnd){
                _self.$message({
                    message: "时间选择错误！",
                    type: "error"
                });
                return;
            }
            var params = {
                rolename: this.searchForm.rolename,
                createTimeBegin: this.searchForm.createTimeBegin,
                createTimeEnd: this.searchForm.createTimeEnd
            };

            axios.post('/role/findByVO', params).then(function(res){
                this.tableData = res.data.result;
                this.total = res.data.result.length;
            }.bind(this),function(error){
                console.log(error)
            })
        },

        //资源详情
        resourceDetails: function(id){
            var _self = this;
            _self.resourceVisible=true;
            axios.get('/resource/getResource/' + id).then(function(res){
                this.resourceList = res.data.result;
            }.bind(this),function(error){
                console.log(error)
            })

        },

        handleNodeClick(data) {
            console.log(data);
        },
        //新增checkbox
        handleCheckChange(data, checked, indeterminate) {
            console.log(data, checked, indeterminate);
        },
        //checkbox分级
        loadNode(node, resolve) {
            if (node.level === 0) {
                return resolve([{ name: 'region1' }, { name: 'region2' }]);
            }
            if (node.level > 3) return resolve([]);

            var hasChild;
            if (node.data.name === 'region1') {
                hasChild = true;
            } else if (node.data.name === 'region2') {
                hasChild = false;
            } else {
                hasChild = Math.random() > 0.5;
            }

            setTimeout(() => {
                var data;
                if (hasChild) {
                    data = [{
                        name: 'zone' + this.count++
                    }, {
                        name: 'zone' + this.count++
                    }];
                } else {
                    data = [];
                }

                resolve(data);
            }, 500);
        },

        //表格勾选事件
        selectionChange: function(val) {
            for (var i = 0; i < val.length; i++) {
                var row = val[i];
            }
            this.multipleSelection = val;
            //this.sels = sels
            console.info(val);
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
            this.getAllResources();
        },
        //新建：提交
        addSubmit: function(val) {
            var _self=this;
            val.resource = this.$refs.tree.getCheckedNodes();
            var params = {
                rolename: val.rolename,
                roleinfo: val.roleinfo,
                resources: val.resource
            }
            axios.post('/role/insertByVO', params).then(function(res){
                var addData = res.data.result;
                _self.tableData.unshift(addData);
                _self.total = _self.tableData.length;
            }.bind(this),function(error){
                console.log(error)
            })
            this.addFormVisible = false;
            _self.loadingData();//重新加载数据
        },

        //删除所选，批量删除
        removeSelection: function() {
            var _self = this;
            var multipleSelection = this.multipleSelection;
            if (multipleSelection.length < 1) {
                _self.$message({
                    message: "请至少选中一条记录",
                    type: "error"
                });
                return;
            }
            //var ids = "";
            var ids = [];
            var deletename =[];
            for (var i = 0; i < multipleSelection.length; i++) {
                var row = multipleSelection[i];
                //ids += row.realname + ",";
                //删除POST请求时传入ids里的roleid作为删除唯一标识
                ids.push(row.roleid);
                deletename.push(row.roleinfo);
            }
            this.$confirm("确认删除" + deletename + "吗?", "提示", {
                type: "warning"
            })
                .then(function() {
                    /*axios.post('',ids).then(function(res){
                        this.delStatus=res.data.status
                        console.log(res.data)
                    }.bind(this),function(error){
                        console.log(error)
                    })
                    this.delStatus="success";
                    if(this.delStatus=="success"){}*/

                    /*POST请求之后再对前台加载*/
                    for(var d =0;d< ids.length;d++){
                        for(var k=0;k< _self.tableData.length;k++)
                        {
                            if(_self.tableData[k].roleid == ids[d]){
                                _self.tableData.splice(k,1);
                            }
                        }


                        _self.$message({
                            message: deletename + "删除成功",
                            type: "success"
                        });
                    }

                    _self.total = _self.tableData.length;
                    _self.loadingData(); //重新加载数据
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
        //表格修改事件
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
                    message:"只能选一条记录进行修改",
                    type:"error"
                });
                return;
            }
            //var ids = "";
            var ids = [];
            for (var i = 0; i < multipleSelection.length; i++) {
                var row = multipleSelection[i];
                //ids += row.realname + ",";
                //编辑时POST传入唯一标识roleid来取出特殊项
                ids.push(row.roleid);
            }
            /*POST请求之后再对前台加载*/
            for(var d =0;d< ids.length;d++){
                for(var k=0;k< _self.tableData.length;k++)
                {
                    if(_self.tableData[k].roleid == ids[d]){
                        _self.selectIndex = k;
                    }
                }
            }
            this.editForm = Object.assign({}, _self.tableData[_self.selectIndex]);
            /*请求到的resource列表传给edit页面数据*/
            //this.editForm.resourcelist = res.data.resourcelist;
            this.editFormVisible = true;
        },
        //保存点击事件
        editSubmit: function(val) {
            var _self = this;
            /*POST请求递交editForm数据传入roleid之后再对前台加载*/
            this.tableData[this.selectIndex].rolename = val.rolename;
            this.tableData[this.selectIndex].roleinfo = val.roleinfo;
            this.tableData[this.selectIndex].create_name = val.create_name;
            this.tableData[this.selectIndex].create_time = val.create_time;
            this.tableData[this.selectIndex].alter_name = val.alter_name;
            this.tableData[this.selectIndex].alter_time = val.alter_time;
            this.editFormVisible = false;
            _self.loadingData();//重新加载数据
            console.info(this.editForm);
        },

        closeDialog:function(val){
            this.addFormVisible = false;
            val.rolename = "";
            val.roleinfo = "";
            val.create_name = "";
            val.create_time ="";
            val.alter_name = "";
            val.alter_time ="";
            this.$refs["addForm"].resetFields();
        },
        closeresourceDialog:function(){
            this.resourceVisible=false;
        }
    },

})