package com.nantian.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.nantian.common.util.CollectionUtils;
import com.nantian.common.util.StringUtils;
import com.nantian.dto.DictionaryDTO;
import com.nantian.entity.sys.*;
import com.nantian.exception.DictionaryException;
import com.nantian.mapper.sys.SysDictionaryMapper;
import com.nantian.service.CacheService;
import com.nantian.service.DictionaryService;
import com.nantian.util.SnowflakeIdUtils;
import com.nantian.util.SqlUtils;
import com.nantian.vo.DictionaryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>ClassName: DictionaryServiceImpl</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2020-01-02</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired
    SysDictionaryMapper dictionaryMapper;

    @Autowired
    CacheService cacheService;

    @Override
    public List<DictionaryDTO> getDictValue(String dictName) {
        //从缓存中获取字典数据
        List<DictionaryDTO> dictionaryCache = cacheService.getCacheDictValue(dictName);
        if (dictionaryCache != null) {
            return dictionaryCache;
        } else {
            //查询指定名称的字典数据
            SysDictionaryExample dictionaryExample = new SysDictionaryExample();
            dictionaryExample.createCriteria().andDictNameEqualTo(dictName);
            List<SysDictionary> dictionaries = dictionaryMapper.selectByExample(dictionaryExample);
            if (CollectionUtils.isEmpty(dictionaries)) {
                return new ArrayList<>();
            }
            //将字典数据进行整理转换
            List<DictionaryDTO> data = new ArrayList<>();
            for (SysDictionary dictionary : dictionaries) {
                DictionaryDTO dictionaryDTO = new DictionaryDTO();
                dictionaryDTO.setKey(dictionary.getDictKey());
                dictionaryDTO.setValue(dictionary.getDictValue());
                data.add(dictionaryDTO);
            }
            //设置到缓存中
            cacheService.setCacheDictValue(dictName, data);
            return data;
        }
    }

    @Override
    public void addDictionary(DictionaryVO dictionary) throws DictionaryException {
        SysDictionary sysDictionary = getSysDictionary(dictionary);
        if(dictionaryMapper.insert(sysDictionary) <= 0){
            throw new DictionaryException("新增记录失败");
        }
        //更新缓存
        updateCache(sysDictionary);
    }

    @Override
    public Page<DictionaryVO> getDictionarys(String dictName, String key, String value, String remark, int page, int limit) {
        SysDictionaryExample example = new SysDictionaryExample();
        SysDictionaryExample.Criteria criteria = example.createCriteria();
        if(StringUtils.isNotBlank(dictName)){
            criteria.andDictNameLike(SqlUtils.allLike(dictName));
        }
        if(StringUtils.isNotBlank(key)){
            criteria.andDictKeyLike(SqlUtils.allLike(key));
        }
        if(StringUtils.isNotBlank(value)){
            criteria.andDictValueLike(SqlUtils.allLike(value));
        }
        if(StringUtils.isNotBlank(remark)){
            criteria.andRemarkLike(SqlUtils.allLike(remark));
        }
        PageHelper.startPage(page, limit);
        Page<SysDictionary> sysDictionaries = (Page<SysDictionary>) dictionaryMapper.selectByExample(example);
        //包装视图对象的Page
        Page<DictionaryVO> pages = new Page<>(sysDictionaries.getPageNum(), sysDictionaries.getPageSize(), true);
        pages.setTotal(sysDictionaries.getTotal());
        pages.setPages(sysDictionaries.getPages());
        pages.setReasonable(sysDictionaries.getReasonable());
        pages.setCountColumn(sysDictionaries.getCountColumn());
        for (SysDictionary sysDictionary:
             sysDictionaries) {
            pages.add(getDictionaryVO(sysDictionary));
        }
        return pages;
    }

    @Override
    public void updateDictionary(DictionaryVO dictionary) throws DictionaryException {
        SysDictionary sysDictionary = getSysDictionary(dictionary);
        dictionaryMapper.updateByPrimaryKeySelective(sysDictionary);
        //对比缓存，如果不同就更新缓存
        updateCache(sysDictionary);
    }

    /**
     * 更新缓存
     * @param sysDictionary
     */
    private void updateCache(SysDictionary sysDictionary) {
        //从缓存查找数据
        List<DictionaryDTO> cacheDictValue = cacheService.getCacheDictValue(sysDictionary.getDictName());
        if(cacheDictValue != null){
            for (DictionaryDTO dict:
                    cacheDictValue) {
                if(dict.getKey().equals(sysDictionary.getDictKey()) && !dict.getValue().equals(sysDictionary.getDictValue())){
                    dict.setValue(sysDictionary.getDictValue());
                    cacheService.updateDictValue(sysDictionary.getDictName(), cacheDictValue);
                }
            }
        }
    }

    @Override
    public DictionaryVO getDictionaryById(Long id) {
        SysDictionary sysDictionary = dictionaryMapper.selectByPrimaryKey(id);
        return getDictionaryVO(sysDictionary);
    }

    @Override
    public void delete(Long id) throws DictionaryException{
        if(dictionaryMapper.deleteByPrimaryKey(id) <= 0){
            throw new DictionaryException("删除失败！");
        }
    }

    /**
     * 转换视图对象为数据对象
     * @param dictionary
     * @return
     */
    private SysDictionary getSysDictionary(DictionaryVO dictionary){
        SysDictionary sysDictionary = new SysDictionary();
        if(dictionary.getId() != null && dictionary.getId() > 0L){
            sysDictionary.setId(dictionary.getId());
        }else{
            SnowflakeIdUtils snowflakeIdUtils = SnowflakeIdUtils.getSnowflake();
            Long id = snowflakeIdUtils.nextId();
            sysDictionary.setId(id);

            sysDictionary.setCreationTime(new Date());
        }

        sysDictionary.setUpdateTime(new Date());

        if(StringUtils.isNotBlank(dictionary.getDictKey())){
            sysDictionary.setDictKey(dictionary.getDictKey());
        }
        if(StringUtils.isNotBlank(dictionary.getDictValue())){
            sysDictionary.setDictValue(dictionary.getDictValue());
        }
        if(StringUtils.isNotBlank(dictionary.getDictName())){
            sysDictionary.setDictName(dictionary.getDictName());
        }
        if(StringUtils.isNotBlank(dictionary.getRemark())){
            sysDictionary.setRemark(dictionary.getRemark());
        }
        return sysDictionary;
    }
    /**
     * 转换视图对象为数据对象
     * @param dictionary
     * @return
     */
    private DictionaryVO getDictionaryVO(SysDictionary dictionary){
        DictionaryVO dictionaryVO = new DictionaryVO();
        dictionaryVO.setId(dictionary.getId());
        if(StringUtils.isNotBlank(dictionary.getDictKey())){
            dictionaryVO.setDictKey(dictionary.getDictKey());
        }
        if(StringUtils.isNotBlank(dictionary.getDictValue())){
            dictionaryVO.setDictValue(dictionary.getDictValue());
        }
        if(StringUtils.isNotBlank(dictionary.getDictName())){
            dictionaryVO.setDictName(dictionary.getDictName());
        }
        if(StringUtils.isNotBlank(dictionary.getRemark())){
            dictionaryVO.setRemark(dictionary.getRemark());
        }
        return dictionaryVO;
    }
}
