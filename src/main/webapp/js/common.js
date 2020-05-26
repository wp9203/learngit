/**
 * 表单重置
 * @param id
 */
function resetForm(id, filterName){
    //'org-form'
    //获取当前表单数据
    var data = form.val(filterName);
    var dis = {};
    $('#' + id).children().each(function() {
        $(":disabled").each(function () {
            dis[$(this).attr('name')] = data[$(this).attr('name')];
        });
    });
    //清空表单
    $('#' + id)[0].reset();
    layui.form.render();
    //充填不可编辑的信息
    form.val(filterName, dis);
}
