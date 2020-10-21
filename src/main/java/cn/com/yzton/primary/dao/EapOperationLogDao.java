package cn.com.yzton.primary.dao;

import cn.com.yzton.primary.entity.EapOperationLog;
import cn.com.yzton.primary.entity.EapOperationLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EapOperationLogDao {
    long countByExample(EapOperationLogExample example);

    int deleteByExample(EapOperationLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EapOperationLog record);

    int insertSelective(EapOperationLog record);

    List<EapOperationLog> selectByExampleWithBLOBs(EapOperationLogExample example);

    List<EapOperationLog> selectByExample(EapOperationLogExample example);

    EapOperationLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EapOperationLog record, @Param("example") EapOperationLogExample example);

    int updateByExampleWithBLOBs(@Param("record") EapOperationLog record, @Param("example") EapOperationLogExample example);

    int updateByExample(@Param("record") EapOperationLog record, @Param("example") EapOperationLogExample example);

    int updateByPrimaryKeySelective(EapOperationLog record);

    int updateByPrimaryKeyWithBLOBs(EapOperationLog record);

    int updateByPrimaryKey(EapOperationLog record);
}