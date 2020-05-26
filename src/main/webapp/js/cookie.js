layui.define(['jquery'],function(exports){
    var $ = layui.$;
    var cookie = {
        getCookie : function(name){
            var cookies = document.cookie.split(";");
            var cookieValue = "";
            $.each(cookies, function (i, item) {
                var arr = item.split('=');
                var cookie_name = arr[0];
                var value = arr[1];
                if (name == cookie_name) {
                    cookieValue = decodeURI(value);
                    return false;
                }
            })
            return cookieValue;
        }
    };
    exports('cookie', cookie);

});