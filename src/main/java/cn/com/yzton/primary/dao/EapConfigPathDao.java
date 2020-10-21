package cn.com.yzton.primary.dao;

import cn.com.yzton.primary.entity.EapConfigPath;
import cn.com.yzton.primary.entity.EapConfigPathExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EapConfigPathDao {
    long countByExample(EapConfigPathExample example);

    int deleteByExample(EapConfigPathExample example);

    int deleteByPrimaryKey(String id);

    int insert(EapConfigPath record);

    int insertSelective(EapConfigPath record);

    List<EapConfigPath> selectByExample(EapConfigPathExample example);

    EapConfigPath selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EapConfigPath record, @Param("example") EapConfigPathExample example);

    int updateByExample(@Param("record") EapConfigPath record, @Param("example") EapConfigPathExample example);

    int updateByPrimaryKeySelective(EapConfigPath record);

    int updateByPrimaryKey(EapConfigPath record);

    EapConfigPath eapConfigPathSelectByExample(EapConfigPathExample example);
}