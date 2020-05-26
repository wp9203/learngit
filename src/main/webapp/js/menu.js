

layui.define(['jquery', 'http', 'element'],function(exports){

    var $ = layui.$,  http = layui.http, element = layui.element;
    var menu = {};

    menu.create = function(navId, url) {


        http.post(url, {}, function(data) {
            $('#' + navId).find('span.layui-nav-bar').remove();
            var trees = data.data;
            var html = "";
            for (var i = 0; i < trees.length; i++) {
                var tree = trees[i];
                var title = tree.title;
                var children = tree.children;
                var type = tree.type;
                var icon = tree.smallIcon;
                var hide = tree.extendData.hide;

                if (hide == '1') {
                    continue;
                }

                html = html + "<li class=\"layui-nav-item\">";
                //解析第二层和第二层，后面的就直接递归
                if ("1" == type) {
                    //分类类型的菜单
                    html = html + "<a href=\"javascript:;\">";
                    if (icon != '' && icon != undefined) {
                        html = html + "<i class=\"layui-icon\">" + icon + "</i>";
                    }
                    html = html + "<em>" + title + "</em><span class=\"layui-nav-more\"></span></a>";

                    if (children.length > 0) {
                        html = html + "<dl class=\"layui-nav-child\">";
                        for (var j = 0; j < children.length; j++) {
                            var child = children[j];
                            var type = child.extendData.hide;
                            if (type == '1') {
                                continue;
                            }
                            html = childCreate(child, html);
                        }
                        html = html + "</dl>";
                    }
                }
                html = html + "</li>";

            }
            $('#' + navId).html(html);

            //重新渲染
            var layFilter = $('#' + navId).attr('lay-filter');
            element.render('nav', layFilter);

            //加载index
            //这里之所以采用动态加载js的原因是因为动态生成的菜单，需要重新渲染dom。不然就没有响应事件
            $(document.body).append('<script src=\"js/index.js\"  data-main=\"home\"><\/script>');

            }, function(err) {
            alert(err);
        })

        /**
         * 创建子菜单
         * @param tree 菜单信息
         * @param html 上级菜单的html
         * @returns {*} 拼上本菜单后的html
         */
        function childCreate(tree, html) {
            var title = tree.title;
            var href = tree.href;
            var children = tree.children;
            var type = tree.type;
            var icon = tree.smallIcon;
            html = html + "<dd>";
            if (type == "1") {
                html = html + "<a href=\"javascript:;\">";
                if (icon != '') {
                    html + "<i class=\"layui-icon\">" + icon + "</i>";
                }
                html += "<em>" + title + "</em><span class=\"layui-nav-more\"></span></a>";

            } else if (type == "2") {
                html += "<a href='" + href + "'>";
                if (icon != '') {
                    html + "<i class=\"layui-icon\">" + icon + "</i>";
                }
                html = html + "<em>" + title + "</em></a>";
            }
            if (children.length > 0) {
                html = html + "<dl class=\"layui-nav-child\">";
                for (var i = 0; i < children.length; i++) {
                    var child = children[i];
                    html = childCreate(child, html);

                }
                html = html + "</dl>";

            }
            html = html + "</dd>";
            return html;
        }

    }

    function refash() {
        layui.define(['element', 'home'],function(exports){

        });
    }

    exports('menu', menu);
});



