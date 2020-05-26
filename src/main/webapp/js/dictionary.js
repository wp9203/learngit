//缓存的字典数据
var dictData = {}

/**
 * 数据字典配置
 */
var config = {
    userStatus : {
        model : 'server',
        labelField : 'key',
        valueField : 'value',
        loadUrl : '../api/index/getDictValue'
    },
    userSex : {
        model : 'server',
        labelField : 'key',
        valueField : 'value',
        loadUrl : '../api/index/getDictValue'
    },
    orgStatus : {
        model : 'server',
        labelField : 'key',
        valueField : 'value',
        loadUrl : '../api/index/getDictValue'
    },
    orgType : {
        model : 'server',
        labelField : 'key',
        valueField : 'value',
        loadUrl : '../api/index/getDictValue'
    },
    roleStatus : {
        model : 'server',
        labelField : 'key',
        valueField : 'value',
        loadUrl : '../api/index/getDictValue'
    },
    menuType : {
        model : 'server',
        labelField : 'key',
        valueField : 'value',
        loadUrl : '../api/index/getDictValue'
    },
    hiddenStatus : {
        model : 'server',
        labelField : 'key',
        valueField : 'value',
        loadUrl : '../api/index/getDictValue'
    },
    menuSord : {
        model : 'server',
        labelField : 'key',
        valueField : 'value',
        loadUrl : '../api/index/getDictValue'
    },
    menuStatus : {
        model : 'server',
        labelField : 'key',
        valueField : 'value',
        loadUrl : '../api/index/getDictValue'
    }
}
/**
 * 字典转换
 * @param dictName 字典名称
 * @param value 待转换value
 * @returns {*}
 */
var dictionary = function(dictName, value) {
    var dict = config[dictName];
    if (dict == null || dict == undefined || dict == '') {
        return value;
    }
    if (value == null || value == undefined || value == '') {
        return '';
    }
    var mode = dict.model;
    var labelField = dict.labelField;
    var valueField = dict.valueField;
    var data = null;
    if (mode == 'local') {
        data = dict.data;
    } else if (mode == 'server') {
        data = dictData[dictName];
        if (data == null || data == undefined) {
            var loadUrl = dict.loadUrl;
            var param = dict.param;
            if (param = undefined || param == null) {
                param = {};
            }
            param.dictName = dictName;
            $.ajax({
                type: "POST",    //请求类型
                url: loadUrl,    //请求地址和参数    GET请求才把参数写在这里
                data: param,    //POST请求的参数以JSON格式传参
                async : false,		//异步请求
                timeout : 30000,	//30秒后超时
                dataType : "json",
                success: function (rep) {
                    var errcode = rep.errcode;
                    var errmsg = rep.errmsg;
                    if (errcode == '0') {
                        data = rep.data;
                        if (rep.data == undefined || rep.data.length == 0) {
                            dictData[dictName] = new Array();
                            return value;
                        }
                        dictData[dictName] = data;
                    } else {
                        return value;
                    }
                },
                error: function (error) {
                    return value;
                }
            });
        }
    } else {
        return value;
    }
    if (data == undefined || data == null) {
        return value;
    }
    var tranValue = null;
    for (var i = 0; i < data.length; i++) {
        var map = data[i];
        var tmp = map[labelField];
        if (tmp == value) {
            tranValue = map[valueField];
            break;
        }
    }
    if (tranValue == null) {
        return value;
    } else {
        return tranValue;
    }
}

