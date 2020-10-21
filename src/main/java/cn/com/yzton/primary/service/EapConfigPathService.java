package cn.com.yzton.primary.service;

import cn.com.yzton.primary.entity.EapConfigPath;

public interface EapConfigPathService {
    int insertSelective(EapConfigPath record);

    int updateByPrimaryKeySelective(EapConfigPath record);
}
