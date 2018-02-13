$('#oscar-nav-btn').click(function () {
    $('.dada2').toggle();
});

//退出
$('#logout').click(function(){
    $('#login-out-form')[0].submit();
});

//左侧菜单的开合
$('#menu-toggle-btn').click(function () {
    var left = $('.left-sidebar'),
        main = $('.main-box'),
        $this = $(this);
    if (left.hasClass('damin')) {
        left.removeClass('damin').css('left', '0');
        main.css('padding-left', '240px');
        setTimeout(function () {
            $this.removeClass('menu-toggle-bg').css({ "right": "0", "transform": "rotateY(0)" });
        }, 300);
    } else {
        left.addClass('damin').css('left', '-240px');
        main.css('padding-left', 0);
        setTimeout(function () {
            $this.addClass('menu-toggle-bg').css({ "right": "-26px", "transform": "rotateY(180deg)" });
        }, 300);
    }
});


// 定义树节点
var treeMenuTemplate = [];
treeMenuTemplate.push('<li class="el-submenu" :class="[open ? \'is-opened\': \'\', selected ? \'is-active\':\'\']">');
treeMenuTemplate.push('<a class="db el-submenu__title" :id="model.index" @click="toggle" v-menu-animation="open" :style="{paddingLeft: paddingLeft + \'px\'}" :href="getUrl">');
treeMenuTemplate.push('<i class="el-icon-message" v-if="level == 1"></i>');
treeMenuTemplate.push('<template v-if="hasChildren()">');
treeMenuTemplate.push('<i class="el-submenu__icon-arrow" :class="[open ? \'el-icon-arrow-up\': \'el-icon-arrow-down\']"></i>');
treeMenuTemplate.push('</template>');
treeMenuTemplate.push('{{ model.resourceinfo }}');
treeMenuTemplate.push('</a>');
treeMenuTemplate.push('<ul class="el-menu" :class="[open ? \'\' : \'dn\']" v-if="hasChildren()">');
treeMenuTemplate.push('<tree-menu v-for="item in model.children" :model="item" :level="level + 1" :theId="theId"></tree-menu>');
treeMenuTemplate.push('</ul>');
treeMenuTemplate.push('</li>');

var treeMenu = Vue.component('tree-menu', {
    template: treeMenuTemplate.join(''),

    created: function () {
        var index = this.model.index;
        var hasIndex = this.theId.search(index);
        var lala = index.replace(this.theId, '');
        if (hasIndex == 0) {
            this.open = true;
        }
        if (hasIndex == 0 && lala.length == 0) {
            this.selected = true;
        }
    },

    props: ['model', 'level', 'theId'],

    computed: {
        getUrl: function () {
            if (this.hasChildren()) {
                return "javascript:;";
            }
            return this.model.url + "?index=" + this.model.index;
        }
    },

    data: function () {
        return {
            open: false,
            paddingLeft: this.level * 20,
            selected: false,

        };
    },

    methods: {
        hasChildren: function () {
            return this.model.children && this.model.children.length;
        },

        toggle: function () {
            if (this.hasChildren()) {
                this.open = !this.open;
            }
        },
    }

});

Vue.directive('menu-animation', function (el, binding) {
    var open = (binding.value);
    var ulElement = $(el).parent().children('ul');
    if (open) {
        ulElement.slideDown(200);
    } else {
        ulElement.slideUp(200);
    }
});

// 定义外围树
var bigTreeTemplate = [];
bigTreeTemplate.push('<div class="tree-menu">');
bigTreeTemplate.push('<ul v-for="menuItem in theModel" class="el-menu">');
bigTreeTemplate.push('<tree-menu :model="menuItem" :level="theLevel" :theId="defaultActive"></tree-menu>');
bigTreeTemplate.push('</ul>');
bigTreeTemplate.push('</div>');

Vue.component('big-tree', {
    template: bigTreeTemplate.join(''),

    props: ['defaultActive'],

    created: function () {
        //设置初始选中项
        this.defaultActive = $('#defaultActive').val();

        axios.get('/getMenu').then(function(res){
            this.theModel = res.data.result;
        }.bind(this),function(error){
            console.log(error);
        })
    },

    data: function () {
        return {
            theModel: null,
            theLevel: 1
        };
    },

    components: {
        'tree-menu': treeMenu
    }
});

new Vue({
    el: '#menu-box',
});