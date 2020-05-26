
layui.define('jquery',function(exports){

    var $ = layui.$;

    var regular = {};
    //邮箱
    regular.email = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
    //手机号码，不支持虚拟手机号码
    regular.phone = /^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$/;

    //邮政编码（中国）
    regular.zip = /^[0-9]\d{5}(?!\d)$/;
    //ip地址
    regular.ip = /((?:(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){3}(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d))/;
    //空白
    regular.blank = /\n\s*\r/;
    //QQ号码
    regular.qq=/[1-9][0-9]{4,}/;
    //数字（0-9）
    regular.number = /^[0-9]*$/;
    //汉字
    regular.chinese = /^[\u4e00-\u9fa5]{0,}$/;
	//座机号码校验
    regular.landline=/(^[0-9]{3,4}\-[0-9]{3,7}$)|(^[0-9]{3,7}$)|(^[0-9]{3,7}$)|(^\([0-9]{3,4}\)[0-9]{3,7}$)/;
    exports('regular', regular);

});

