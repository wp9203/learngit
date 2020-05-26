
layui.define(['layer'],function(exports){

	var $ = layui.$, layer = layui.layer;

	var http = {};

	var headers = {};

	var async = true;
	http.setHeader = function(name, value) {
		headers[name]=value;
		return http;
	}
	http.setAsync = function(isAsync) {
		async = isAsync;
	}

	/**
	 * http post请求
	 * @param url url路径
	 * @param param 参数
	 * @param successCallBack 成功回调
	 */
	http.post = function(url, param, successCallBack) {

		request(url, 'POST', param, function (data) {
			success(data, successCallBack);
		}, function(data) {
			error(data, function() {});
		});
	}

	/**
	 * http post请求
	 * @param url url路径
	 * @param param 参数
	 * @param successCallBack 成功回调
	 * @param errorCallBack 失败回调
	 */
	http.post = function(url, param, successCallBack, errorCallBack) {
		request(url, 'POST', param, function (data) {
			success(data, successCallBack);
		}, function(data) {
			error(data, errorCallBack);
		});
	}

	/**
	 * http get请求
	 * @param url url路径
	 * @param param 参数
	 * @param success 成功回调
	 */
	http.get = function(url, param, successCallBack) {
		var nUrl = getUrl(url, param);
		request(nUrl, 'GET', param, function (data) {
			success(data, successCallBack);
		}, function(data) {
			error(data, function () {
				
			});
		});
	}
	/**
	 * http get请求
	 * @param url url路径
	 * @param param 参数
	 * @param success 成功回调
	 * @param error 失败回调
	 */
	http.get = function(url, param, successCallBack, errorCallBack) {
		var nUrl = getUrl(url, param);
		request(nUrl, 'GET', param, function (data) {
			success(data, successCallBack);
		}, function(data) {
			error(data, errorCallBack);
		});
	}

	/**
	 * 请求成功处理
	 * @param data 失败信息
	 * @param errorCallBack 失败回调
	 */
	function error(data, errorCallBack) {
		layer.closeAll('loading');
	}

	/**
	 * 请求成功的处理
	 * @param data http响应内容
	 * @param successCallBack 成功后的回调
	 */
	function success(data, successCallBack) {
		layer.closeAll('loading');
		var errcode = data.errcode;
		var errmsg = data.errmsg;
		if (errcode == '-1') {
			//服务内部错误
			layer.msg(errmsg, function () {

			});
		} else if (errcode == '403') {
			//没有权限
			layer.msg(errmsg, function () {

			});
		} else {
			successCallBack(data);
		}

	}

	/**
	 * 拼装get请求的url
	 * @param url 原url
	 * @param param 请求参数
	 * @returns {string} 拼装后的url
	 */
	function getUrl(url, param) {
		if (param != undefined && param instanceof Object) {
			if (url.indexOf("?") != -1) {
				//带了参数，并且最后一个字符不是？也不是&。则拼上&符号，继续加参数
				var endStr = url.charAt(url.length - 1);
				if (endStr != "&" && endStr != "?") {
					url += "&";
				}
			} else {
				url += "?";
			}
			map.forEach(function(value, key){
				url = url + key + "=" + value + "&";
			});
			url = url.substr(0, url.length - 1);
		}
		return url;
	}

	/**
	 * ajax请求
	 * @param url url路径
	 * @param type 请求类型:GET/POST/DELETE/PUT
	 * @param data 参数
	 * @param success 请求成功回调函数
	 * @param error 失败回调函数
	 */
	function request(url, type, data, success, error) {
		layer.load();
		$.ajax({
			type: type,    //请求类型
			url: url,    //请求地址和参数    GET请求才把参数写在这里
			data: data,    //POST请求的参数以JSON格式传参
			async : async,		//异步请求
			timeout : 30000,	//30秒后超时
			beforeSend: function(request) {
				if (headers != null && headers != undefined && headers instanceof Object) {
					for (var key in headers) {
						request.setRequestHeader(key, headers[key]);
					}
				}
			},
			dataType : "json",
			success: success,
			error: error
		});
	}
	exports('http', http);

});

