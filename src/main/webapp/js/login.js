layui.define(['element', 'layer', 'http'],function(exports){

    var $ = layui.$,layer = layui.layer, http = layui.http;
    $('.input-field').on('change',function(){
        var $this = $(this),
            value = $.trim($this.val()),
            $parent = $this.parent();

        if(value !== '' && !$parent.hasClass('field-focus')){
            $parent.addClass('field-focus');
        }else{
            $parent.removeClass('field-focus');
        }
    })
    exports('login');

    $("#login").click(function () {
        var param = {};
        param.username = $("#username").val();
        param.password = $("#password").val();
        http.post("api/login/login", param, function(data) {
            if (data.errcode == '0') {
                window.location.href='index.html';
            } else {
                layer.msg('帐号或密码不正确', function(){
                });
            }

        }, function() {

        });

    });
});