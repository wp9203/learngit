package com.nantian.controller;

import com.github.pagehelper.Page;
import com.nantian.common.util.StringUtils;
import com.nantian.constant.Application;
import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysCandidateInfo;
import com.nantian.entity.sys.SysUser;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.exception.FlowException;
import com.nantian.exception.SysCandidateInfoException;
import com.nantian.service.CandidateInfoService;
import com.nantian.service.FlowService;
import com.nantian.service.UserService;
import com.nantian.util.ResponeResult;
import com.nantian.util.SignToWordUtils;
import com.nantian.vo.CandidateInfoVo;
import com.nantian.vo.ListCANVO;
import com.nantian.vo.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>ClassName: UserController</p>
 * <p>Description: 竞聘者（民主推荐 公开竞聘）管理控制器</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2020-04-16</p>
 *
 * @author 唐剑波
 * @version 1.0
 */

@Trade(channel = "api", transCode = "candidateInfo")
public class CandidateInfoController {
    private static Logger log= LoggerFactory.getLogger(CandidateInfoController.class);

    @Autowired
    CandidateInfoService candidateInfoService;
    @Autowired
    FlowService flowService;
    @Autowired
    UserService userService;
    /**
     * 新增竞聘者
     * @param context 应用上下文
     * @param candidateInfoVo 新增的用户信息
     */
    @Push
    public void add(ApplicationContext context, @ParameterObject CandidateInfoVo candidateInfoVo) throws SysCandidateInfoException{


        if (StringUtils.isBlank(candidateInfoVo.getCandidateName())) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "竞聘者不能为空");
            return;
        }
        if (StringUtils.isBlank(candidateInfoVo.getUnit())) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "竞聘者单位不能为空");
            return;
        }
        try {
            candidateInfoService.addCandidateInfo(candidateInfoVo);
        } catch (SysCandidateInfoException e) {
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }
    }

    @Push
    public void query(ApplicationContext context, int page, int limit) {

        if (limit > Application.PAGE_COUNT) {
            context.setRstObject ("data", ResponeResult.responeEmpty());
            context.setErrorMsg(ErrorCodeEnum.QUERY_OVER_ERROR.getErrcode(), ErrorCodeEnum.QUERY_OVER_ERROR.getErrmsg());
            return;
        }
        Page<SysCandidateInfo> sysCandidateInfo = candidateInfoService.query(page, limit);

        ResponeResult responeResult = ResponeResult.responeBuilder(sysCandidateInfo.getTotal(), sysCandidateInfo.getResult());
        context.setRstObject("data", responeResult);
    }

    /**
     * 删除竞聘者
     * @param context 应用上下文
     * @param id 指定的用户id
     */
    @Push
    public void delete(ApplicationContext context, Long id) {
        if (id == null || id <= 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "用户id不能为空");
            return;
        }
        candidateInfoService.delete(id);
    }

    /**
     * 更新竞聘者信息
     * @param context 应用上下文
     * @param listCANVO 需要更新的用户信息
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void update(ApplicationContext context , @ParameterObject ListCANVO listCANVO) {
        //民主推荐 req==null
        if(listCANVO.getReq()==null||listCANVO.getReq().equals("")){
            for (int i = 0; i < listCANVO.getInfos().size(); i++) {
                CandidateInfoVo candidateInfoVo = listCANVO.getInfos().get(i);
                candidateInfoService.update(candidateInfoVo);
            }
        }else {
            for (int i = 0; i < listCANVO.getInfos().size(); i++) {
                CandidateInfoVo candidateInfoVo = listCANVO.getInfos().get(i);
                candidateInfoVo.setMeetingDate(listCANVO.getReq().get(0).getMeetingDate());
                candidateInfoVo.setHost(listCANVO.getReq().get(0).getHost());
                candidateInfoVo.setDueNumber(listCANVO.getReq().get(0).getDueNumber());
                candidateInfoVo.setActualNumber(listCANVO.getReq().get(0).getActualNumber());
                candidateInfoVo.setSummaryNumber(listCANVO.getReq().get(0).getSummaryNumber());
                candidateInfoVo.setApprovalType(listCANVO.getReq().get(0).getApprovalType());
                candidateInfoVo.setReplyDate(listCANVO.getReq().get(0).getReplyDate());
                candidateInfoService.update(candidateInfoVo);
            }
        }
    }

    /**
     * 查询民主推荐的竞聘者
     * @param context 应用上下文
     *
     */
    @Push
    public void queryRe(ApplicationContext context, int page, int limit) {
        if (limit > Application.PAGE_COUNT) {
            context.setRstObject ("data", ResponeResult.responeEmpty());
            context.setErrorMsg(ErrorCodeEnum.QUERY_OVER_ERROR.getErrcode(), ErrorCodeEnum.QUERY_OVER_ERROR.getErrmsg());
            return;
        }
        Page<SysCandidateInfo> sysCandidateInfo = candidateInfoService.queryRe(page, limit);
        ResponeResult responeResult = ResponeResult.responeBuilder(sysCandidateInfo.getTotal(), sysCandidateInfo.getResult());
        context.setRstObject("data", responeResult);
    }

    /**
     * 查询公开竞聘的竞聘者
     * @param context 应用上下文
     *
     */
    @Push
    public void queryCom(ApplicationContext context, int page, int limit) {
        if (limit > Application.PAGE_COUNT) {
            context.setRstObject ("data", ResponeResult.responeEmpty());
            context.setErrorMsg(ErrorCodeEnum.QUERY_OVER_ERROR.getErrcode(), ErrorCodeEnum.QUERY_OVER_ERROR.getErrmsg());
            return;
        }
        Page<SysCandidateInfo> sysCandidateInfo = candidateInfoService.queryCom(page, limit);
        ResponeResult responeResult = ResponeResult.responeBuilder(sysCandidateInfo.getTotal(), sysCandidateInfo.getResult());
        context.setRstObject("data", responeResult);
    }

    /**
     * 核查竞聘者是否符合
     * @param context 应用上下文
     * @param listCANVO 需要验证的竞聘信息
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void checks(ApplicationContext context , @ParameterObject ListCANVO listCANVO) {

        for(int i=0;i<listCANVO.getInfos().size();i++){
            Long id=listCANVO.getInfos().get(i).getId();
            SysUser user = userService.getUser(id);

            if(StringUtils.isNotBlank(user.getPositionSerial())){
                context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "用户职务序列为空");
                return;
            }
            candidateInfoService.checks(user);
        }
    }
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void sign(ApplicationContext context , @ParameterObject ListCANVO listCANVO) {
        String path="E:/";
        List<CandidateInfoVo> list = listCANVO.getInfos();
        SignToWordUtils.writeWordFile(list,path);


    }
}
