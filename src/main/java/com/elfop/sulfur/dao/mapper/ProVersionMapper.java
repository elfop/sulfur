package com.elfop.sulfur.dao.mapper;

import com.elfop.sulfur.dao.bean.ProVersion;
import com.elfop.sulfur.dao.bean.ProVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProVersionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_version
     *
     * @mbg.generated
     */
    long countByExample(ProVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_version
     *
     * @mbg.generated
     */
    int deleteByExample(ProVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_version
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_version
     *
     * @mbg.generated
     */
    int insert(ProVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_version
     *
     * @mbg.generated
     */
    int insertSelective(ProVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_version
     *
     * @mbg.generated
     */
    List<ProVersion> selectByExample(ProVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_version
     *
     * @mbg.generated
     */
    ProVersion selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_version
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ProVersion record, @Param("example") ProVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_version
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ProVersion record, @Param("example") ProVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_version
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ProVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_version
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProVersion record);
}