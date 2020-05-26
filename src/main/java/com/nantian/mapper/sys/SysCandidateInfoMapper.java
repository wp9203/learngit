package com.nantian.mapper.sys;

import com.nantian.entity.sys.SysCandidateInfo;
import com.nantian.entity.sys.SysCandidateInfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCandidateInfoMapper {
    /**
     * 根据条件统计数据
     * @param example 条件
     * @return 统计的数量
     */
    long countByExample(SysCandidateInfoExample example);

    /**
     * 根据条件删除数据
     * @param example 条件
     * @return 删除的条数
     */
    int deleteByExample(SysCandidateInfoExample example);

//    /**
//     * 根据主键删除数据
//     * @param id 主键
//     * @return 删除的条数
//     */
//    int deleteByPrimaryKey(BigDecimal id);

    /**
     * 插入一条数据
     * @param record Po对象
     * @return 插入的条数
     */
    int insert(SysCandidateInfo record);

    /**
     * 根据条件插入数据（字段值为null时，该字段不插入）
     * @param record Po对象
     * @return 插入的条数
     */
    int insertSelective(SysCandidateInfo record);

    /**
     * 根据条件查询数据
     * @param example 条件
     * @return 查询的集合
     */
    List<SysCandidateInfo> selectByExample(SysCandidateInfoExample example);

    /**
     * 根据主键查询数据
     * @param id 主键
     * @return 查询的集合
     */
    SysCandidateInfo selectByPrimaryKey(BigDecimal id);

    /**
     * 根据条件更新字段数据（字段值为null时，该字段不更新）
     * @param record Po对象
     * @param example 条件
     * @return 更新的条数
     */
    int updateByExampleSelective(@Param("record") SysCandidateInfo record, @Param("example") SysCandidateInfoExample example);

    /**
     * 根据条件更新所有字段数据
     * @param record Po对象
     * @param example 条件
     * @return 更新的条数
     */
    int updateByExample(@Param("record") SysCandidateInfo record, @Param("example") SysCandidateInfoExample example);

    /**
     * 根据主键更新字段数据（字段值为null时，该字段不更新）
     * @param record Po对象
     * @return 更新的条数
     */
    int updateByPrimaryKeySelective(SysCandidateInfo record);

    /**
     * 根据主键更新所有字段数据
     * @param record Po对象
     * @return 更新的条数
     */
    int updateByPrimaryKey(SysCandidateInfo record);

    void insertInto(SysCandidateInfo sysCandidateInfo);

    /**
     * 根据条件查询数据
     * @param example 条件
     * @return 查询的集合
     */
    List<SysCandidateInfo> selectByExampleX(SysCandidateInfoExample example);

    /**
     * 根据主键删除数据
     * @param id 主键
     * @return 删除的条数
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 根据条件查询数据(民主推荐)
     * @param example 条件
     * @return 查询的集合
     */
    List<SysCandidateInfo> selectRe(SysCandidateInfoExample example);

    /**
     * 根据条件查询数据（公开竞聘）
     * @param example 条件
     * @return 查询的集合
     */
    List<SysCandidateInfo> selectCom(SysCandidateInfoExample example);

    List<SysCandidateInfo> queryCandidateInfoById(Long id);


}