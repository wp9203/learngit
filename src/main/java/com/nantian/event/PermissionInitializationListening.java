package com.nantian.event;

import com.nantian.common.util.CollectionUtils;
import com.nantian.constant.StatusConsts;
import com.nantian.dto.AuthorizationDTO;
import com.nantian.entity.sys.*;
import com.nantian.mapper.sys.SysPermissionMapper;
import com.nantian.mapper.sys.SysRoleMapper;
import com.nantian.mapper.sys.SysRolePermissionMapper;
import com.nantian.service.PermissionService;
import com.nantian.service.impl.PermissionServiceImpl;
import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>ClassName: PermissionInitializationListening</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-23</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Component
public class PermissionInitializationListening implements ApplicationListener<ContextRefreshedEvent> {

    private static Logger log = LoggerFactory.getLogger(PermissionInitializationListening.class);
    @Autowired
    PermissionService permissionService;
    @Autowired
    SysPermissionMapper permissionMapper;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //从权限表中，查询出所有的状态是正常，且是类型是操作的菜单数据
        SysPermissionExample permissionExample = new SysPermissionExample();
        permissionExample.createCriteria().andStatusEqualTo(StatusConsts.PERMISSION_STATUS_NORMAL).andTypeEqualTo(StatusConsts.PERMISSION_TYPE_OPERATION);
        List<SysPermission> permissions = permissionMapper.selectByExample(permissionExample);

        if (CollectionUtils.isEmpty(permissions)) {
            log.info("当前权限表中没有任何权限信息");
            return;
        }

        List<Long> pIds = new ArrayList<>();
        for (SysPermission permission : permissions) {
            pIds.add(permission.getId());
        }
        List<AuthorizationDTO> authorizations = permissionService.queryPermissionRoleData(pIds);
        if (CollectionUtils.isEmpty(authorizations)) {
            log.info("当前权限表中没有任何权限信息");
        }
        //将url中对应的权限数据添加到缓存中
        boolean result = permissionService.addPermissionCache(authorizations);
        if (!result) {
            log.error("权限信息缓存redis失败");
        }
    }


}
