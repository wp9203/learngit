package com.nantian.controller;

import com.github.pagehelper.Page;
import com.nantian.common.util.StringUtils;
import com.nantian.constant.Application;
import com.nantian.dto.DictionaryDTO;
import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.exception.DictionaryException;
import com.nantian.service.DictionaryService;
import com.nantian.util.ResponeResult;
import com.nantian.vo.DictionaryVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>ClassName: DictionaryController</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2020-01-02</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Trade(channel = "api", transCode = "dict")
public class DictionaryController {
    private static Logger logger = LoggerFactory.getLogger(DictionaryController.class);
    @Autowired
    DictionaryService dictionaryService;



    /**
     * 新增字典
     * @param context
     * @param dictionary
     */
    @Push
    public void add(ApplicationContext context,@ParameterObject DictionaryVO dictionary){
        if(dictionary == null){
            context.setErrorMsg("字典为空，无法新增");
            return;
        }
        try{
            dictionaryService.addDictionary(dictionary);
        }catch (DictionaryException e){
            logger.error(e.getMessage(), e);
            context.setErrorMsg(e.getMessage());
        }
    }

    /**
     * 更新字典
     * @param context
     * @param dictionary
     */
    @Push
    public void update(ApplicationContext context, @ParameterObject DictionaryVO dictionary){
        if (dictionary.getId() == null || dictionary.getId() <= 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "待更新的字典id不能为空");
            return;
        }
        try{
            dictionaryService.updateDictionary(dictionary);
        }catch (DictionaryException e){
            logger.error(e.getMessage(), e);
            context.setErrorMsg(e.getMessage());
        }
    }

    /**
     * 根据主键查询字典
     * @param context
     * @param id
     */
    @Push
    public void getDict(ApplicationContext context, Long id){
        if (id == null || id <= 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "需要编辑的字典id不能为空");
            return;
        }
        DictionaryVO dictionary = dictionaryService.getDictionaryById(id);
        context.setRstObject("data", dictionary);
    }
    /**
     * 查询当前字典的key-value
     * @param context
     * @param dictName
     * @param dictKey
     * @param dictValue
     * @param remark
     * @param page
     * @param limit
     */
    @Push
    public void query(ApplicationContext context ,String dictName,String dictKey,String dictValue, String remark, int page , int limit){
        if (limit > Application.PAGE_COUNT) {
            context.setErrorMsg(ErrorCodeEnum.QUERY_OVER_ERROR.getErrcode(), ErrorCodeEnum.QUERY_OVER_ERROR.getErrmsg());
            return;
        }
        Page<DictionaryVO> dictionaries = dictionaryService.getDictionarys(dictName, dictKey, dictValue, remark, page, limit);

        ResponeResult responeResult = ResponeResult.responeBuilder(dictionaries.getTotal(), dictionaries.getResult());
        context.setRstObject("data", responeResult);
    }

    /**
     * 根据主键删除字典
     * @param context
     * @param id
     */
    @Push
    public void delete(ApplicationContext context, Long id){
        if (id <= 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "待删除的字典id不能为空");
            return;
        }
        try{
            dictionaryService.delete(id);
        }catch (DictionaryException e){
            logger.error(e.getMessage(), e);
            context.setErrorMsg(e.getMessage());
        }

    }
}
