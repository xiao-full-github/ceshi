package cn.com.yzton.secondary.service;


import cn.com.yzton.secondary.entity.EapUser2;
import cn.com.yzton.secondary.entity.EapUser2Example;

import java.util.List;

public interface EapUser2Service {

    /**
     * 用户登录
     *
     * @param name      账号
     * @param password  密码
     * @param isadmin   类型
     * @param actortype 是否账套主管
     * @param isstoped  是否停用
     * @return
     */
    public abstract EapUser2 login(String name, String password, Boolean isadmin,
                                  Boolean actortype, Boolean isstoped);


    List<EapUser2> selectByExample(EapUser2Example example);
}
