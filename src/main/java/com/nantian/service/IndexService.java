package com.nantian.service;

import com.nantian.dto.TreeDTO;

import java.util.List;

/**
 * <p>ClassName: IndexService</p>
 * <p>Description: 首页service </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-06</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public interface IndexService {

    /**
     * 查询当前用户的菜单
     * @return 菜单树数据
     */
    List<TreeDTO> queryCurrentUserMenu();

}
