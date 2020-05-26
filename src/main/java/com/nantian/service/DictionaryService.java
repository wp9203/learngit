package com.nantian.service;

import com.github.pagehelper.Page;
import com.nantian.dto.DictionaryDTO;
import com.nantian.dto.TreeDTO;
import com.nantian.entity.sys.SysDictionary;
import com.nantian.exception.DictionaryException;
import com.nantian.vo.DictionaryVO;

import java.util.List;

/**
 * <p>ClassName: DictionaryService</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2020-01-02</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public interface DictionaryService {

    /**
     * 获取指定字典名称的字典数据
     * @param dictName 字典名称
     * @return 字典数据
     */
    List<DictionaryDTO> getDictValue(String dictName);

    /**
     * 新增字典
     * @param dictionary
     */
    void addDictionary(DictionaryVO dictionary) throws DictionaryException;

    /**
     * 分页查询字典列表
     * @param dictName
     * @param key
     * @param value
     * @param remark
     * @param page
     * @param limit
     * @return
     */
    Page<DictionaryVO> getDictionarys(String dictName, String key, String value, String remark, int page, int limit);


    /**
     * 更新字典
     * @param dictionary
     */
    void updateDictionary(DictionaryVO dictionary) throws DictionaryException ;

    /**
     * 通过主键查询字典对象
     * @param id
     * @return
     */
    DictionaryVO getDictionaryById(Long id);

    /**
     * 根据主键删除字典
     * @param id
     */
    void delete(Long id) throws DictionaryException;
}
