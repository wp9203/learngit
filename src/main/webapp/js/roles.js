/**
 项目JS主入口
 以依赖layui的layer和form模块为例
 **/
layui.define(['layer'], function(exports){
    var $ = layui.layer;
    var roles = {
//新增、编辑角色，权限操作
        rolesOperate:function(title, address){
            layer.open({
                type: 2,
                skin: 'layui-layer-demo', //样式类名
                title: title,
                closeBtn: 1, //显示关闭按钮
                anim: 2,
                area: ['893px', '600px'],
                shadeClose: true, //开启遮罩关闭
                content: address
            });
        },
        //删除指定角色
        rmRole:function(){

        }
    };

    exports('roles', roles); //注意，这里是模块输出的核心，模块名必须和use时的模块名一致
});