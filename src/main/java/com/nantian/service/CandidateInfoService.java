package com.nantian.service;

import com.github.pagehelper.Page;
import com.nantian.entity.sys.SysCandidateInfo;
import com.nantian.entity.sys.SysFlow;
import com.nantian.entity.sys.SysUser;
import com.nantian.exception.FlowException;
import com.nantian.exception.SysCandidateInfoException;
import com.nantian.exception.SysUserException;
import com.nantian.vo.CandidateInfoVo;
import com.nantian.vo.UserVO;


public interface CandidateInfoService {

    /**
     * 添加一个竞聘者
     * @param candidateInfoVo 需要添加的用户信息
     */
    void addCandidateInfo(CandidateInfoVo candidateInfoVo) throws SysCandidateInfoException;

    /**
     * 分页查询
     * @param page 当前第几页
     * @param limit 每页数量
     * @return 带分页的数据
     */

    Page<SysCandidateInfo> query(int page, int limit);


    void delete(Long id);

    /**
     * 更新竞聘者信息
     * @param candidateInfoVo 需要更新的竞聘者信息
     */
    void update(CandidateInfoVo candidateInfoVo);

    /**
     * 分页查询（民主推荐）
     * @param page 当前第几页
     * @param limit 每页数量
     * @return 带分页的数据
     */

    Page<SysCandidateInfo> queryRe(int page, int limit);

    /**
     * 分页查询（公开竞聘）
     * @param page 当前第几页
     * @param limit 每页数量
     * @return 带分页的数据
     */

    Page<SysCandidateInfo> queryCom(int page, int limit);

    void checks(SysUser user);
    
     SysCandidateInfo queryCandidateInfoById(Long id);
}
