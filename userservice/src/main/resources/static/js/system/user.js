new Vue({
    el: '#app',
    data: function() {
            return {
                visible: false,
                awa:'',
                searchForm: {username: '',realname: ''},//搜索表单
                tableData: [],//Grid中数据
                tableheight :445,//表高度变量
                loading: false,//显示加载中样
                allRoles: '',
                //多选值
                multipleSelection: [],
                //当前页
                currentPage: 1,
                //分页大小
                pageSize: 10,
                //总记录数
                total: 0,
                indexData: 0,//序号
                //删除的弹出框
                deleteVisible: false,
                //新建页面是否显示
                addFormVisible: false,
                addLoading: false,
                addFormRules: {
                    username: [{ required: true, message: "请输入用户名", trigger: "blur" }],
                    realname: [{ required: true, message: "请输入真实姓名", trigger: "blur" }],
                    password: [{ required: true, message: "请输入密码", trigger: "blur" }],
                    password2: [{ required: true, message: "请再次输入密码", trigger: "blur" }],
                },
                //新建数据
                addForm: {
                    username: '',
                    realname: '',
                    password: '',
                    password2: '',
                    birth: '',
                    sex: '',
                    mobile: '',
                    email: '',
                    roles: []
                },
                //选中的序号
                selectIndex: -1,
                //编辑界面是否显示
                editFormVisible: false,
                editFormUserid: false,
                editLoading: false,
                editFormRules: {
                    realname: [{ required: true, message: "请输入真实姓名", trigger: "blur" }],
                    password: [{ message: "请输入密码", trigger: "blur" }],
                    password2: [{ message: "请再次输入密码", trigger: "blur" }]
                },
                //编辑界面数据
                editForm: {
                    pkid: '',
                    userid: '',
                    username:'',
                    realname: '',
                    password: '',
                    password2: '',
                    birth: '',
                    sex: '',
                    mobile: '',
                    email: '',
                    roles: ''
                },
                editFormSelect: [],
                roleDetailVisible: false,
                roleDetailList: [],
                roleDetailSelect: []
            }
        },
    created: function () {
        this.searchClick();
    },
    methods:{
        //初始化数据
        searchClick: function(){
            var params = {
                username: this.searchForm.username,
                realname: this.searchForm.realname,
                pageSize: this.pageSize,
                pageNum: this.currentPage
            }
            axios.post('/user/findByVO', params).then(function(res){
                this.tableData = res.data.result;
                this.total = res.data.result.length;
            }.bind(this),function(error){
                console.log(error)
            })
        },

        //性别格式化
        sexFormat: function(row, column){
            switch(row[column.property]){
                case '1':
                    return '男';
                    break;
                case '2':
                    return '女';
                    break;
            }
        },
        //时间格式化
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

        //表格勾选事件
        selectionChange: function(val) {
            this.multipleSelection = val;
        },


        //增加、修改时“生日”表单赋值
        dateChangebirthday(val) {
            this.addForm.birth = val;
            this.editForm.birth = val;
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

        //查看角色详情
        roleDetails: function(id){
            var _self = this;
            _self.roleDetailVisible = true;
            axios.get('/role/getRole/' + id).then(function(res){
                this.roleDetailList = res.data.result;
                for(var i=0;i<this.roleDetailList.length;i++){
                    this.roleDetailSelect.push(this.roleDetailList[i].rolename);
                }
            }.bind(this),function(error){
                console.log(error)
            })
        },

        //表格删除事件
        deleteClick: function(index,row) {
            var _self = this;
            this.$confirm("确认删除吗?", "提示", {
                type: "warning",
                confirmButtonText: '确定',
                cancelButtonText: '取消'
            })
                .then(function() {
                    _self.tableData.splice(index,1);
                    _self.$message({
                        message: "删除成功",
                        type: "success"
                    });
                    _self.loadingData();
                })
                .catch(function(e) {
                    if (e != "cancel") console.log("出现错误：" + e);
                });
        },

        //获取所有的角色
        getAllRoles: function(){
            axios.get('/role/getAll').then(function(res){
                this.allRoles = res.data.result;
            }.bind(this),function(error){
                console.log(error)
            })
        },

        change: function(el){
            if(el == 'username'){
                
            }
        },

        //新增：弹出Dialog
        addClick: function() {
            // window.location.href = this.$http.options.root + "/user/add";
            var _self = this;
            _self.addFormVisible = true;
            this.getAllRoles();
        },
        //新增：提交按钮
        addSubmit: function(val) {
            var _self = this;
            if(val.password == val.password2){
                var params = {
                    username: val.username,
                    password: val.password,
                    realname: val.realname,
                    birth: val.birth,
                    sex: val.sex,
                    mobile: val.mobile,
                    email: val.email,
                    roles: val.roles
                }
                axios.post('/user/insertByVO', params).then(function(res){
                    var addData = res.data.result;
                    _self.tableData.unshift(addData);
                    _self.total = _self.tableData.length;
                }.bind(this),function(error){
                    console.log(error)
                })
                this.addFormVisible = false;
                _self.loadingData();//重新加载数据
            }else{
                _self.$message({
                    message: "两次密码输入不一致！",
                    type: "error"
                });
                return;
            }
        },

        //修改：
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

            var userid = multipleSelection[0].userid;

            //获取选择的行号
            for(var k=0;k< _self.tableData.length;k++) {
                if(_self.tableData[k].userid == userid){
                    _self.selectIndex = k;
                }
            }

            //直接从table中取值放在form表单中
            this.editForm = Object.assign({}, _self.tableData[_self.selectIndex]);
            this.editForm.password = '';
            this.editForm.password2 = '';
            this.getAllRoles();
            this.editFormSelect = [];
            for(var i=0;i<this.editForm.roles.length;i++){
                this.editFormSelect.push(this.editForm.roles[i].rolename);
            }
            this.editFormVisible = true;

            //穿透：从后台发请求获取数据显示在form中
            /*
            var params = {
                userid: userid
            }
            axios.post('/user/findByVO', params).then(function(res){
                var editData = res.data.result[0];
                this.editForm = Object.assign(editData);
                this.editForm.sex = parseInt(editData.sex);

                this.getAllRoles();
                this.editFormSelect = [];
                for(var i=0;i<this.editForm.roles.length;i++){
                    this.editFormSelect.push(this.editForm.roles[i].rolename);
                }
                this.editFormVisible = true;
            }.bind(this),function(error){
                console.log(error)
            })
            */

        },
        //修改：提交按钮
        editSubmit: function(val) {
            var _self = this;
            if(val.password == val.password2){
                var params = {
                    pkid: val.pkid,
                    userid: val.userid,
                    username: val.username,
                    password: val.password,
                    realname: val.realname,
                    birth: val.birth,
                    sex: val.sex,
                    mobile: val.mobile,
                    email: val.email,
                    roles: val.roles
                };
                axios.post('/user/updateByVO', params).then(function(res){
                    this.tableData[this.selectIndex].username = val.username;
                    this.tableData[this.selectIndex].realname = val.realname;
                    this.tableData[this.selectIndex].birth = val.birth;
                    this.tableData[this.selectIndex].sex = val.sex;
                    this.tableData[this.selectIndex].mobile = val.mobile;
                    this.tableData[this.selectIndex].email = val.email;
                    this.tableData[this.selectIndex].roles = val.roles;
                }.bind(this),function(error){
                    console.log(error)
                })
                this.editFormVisible = false;
                _self.loadingData();
            }else{
                _self.$message({
                    message: "两次密码输入不一致！",
                    type: "error"
                });
                return;
            }
        },

        //删除：批量删除
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
            var ids = [];
            var realname = [];
            for (var i = 0; i < multipleSelection.length; i++) {
                var row = multipleSelection[i];
                ids.push(row.pkid);
                realname.push(row.realname);
            }
            this.$confirm("确认删除吗？", "提示", {type: "warning"})
                .then(function() {
                    var params = {
                        ids: ids
                    }
                    axios.post('/user/deleteByIds', params).then(function(res){
                        for(var d =0;d< ids.length;d++){
                            for(var k=0;k< _self.tableData.length;k++) {
                                if(_self.tableData[k].pkid == ids[d]){
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


        closeDialog:function(val){
            this.addFormVisible = false;
            val.username ='';
            val.realname = '';
            val.password = '';
            val.password2 = '';
            val.birth = '';
            val.sex = '';
            val.mobile = '';
            val.email ='';
            this.$refs["addForm"].resetFields();
        }
    },

});
