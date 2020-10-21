package cn.com.yzton.primary.dao;

import cn.com.yzton.primary.entity.EapUser;
import cn.com.yzton.primary.entity.EapUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EapUserDao {
    long countByExample(EapUserExample example);

    int deleteByExample(EapUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EapUser record);

    int insertSelective(EapUser record);

    List<EapUser> selectByExample(EapUserExample example);

    EapUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EapUser record, @Param("example") EapUserExample example);

    int updateByExample(@Param("record") EapUser record, @Param("example") EapUserExample example);

    int updateByPrimaryKeySelective(EapUser record);

    int updateByPrimaryKey(EapUser record);
}