package cn.com.yzton.secondary.dao;

import cn.com.yzton.secondary.entity.EapUser2;
import cn.com.yzton.secondary.entity.EapUser2Example;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EapUser2Dao {
    long countByExample(EapUser2Example example);

    int deleteByExample(EapUser2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(EapUser2 record);

    int insertSelective(EapUser2 record);

    List<EapUser2> selectByExample(EapUser2Example example);

    EapUser2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EapUser2 record, @Param("example") EapUser2Example example);

    int updateByExample(@Param("record") EapUser2 record, @Param("example") EapUser2Example example);

    int updateByPrimaryKeySelective(EapUser2 record);

    int updateByPrimaryKey(EapUser2 record);

    EapUser2 loginSelectByExample(EapUser2Example example);
}