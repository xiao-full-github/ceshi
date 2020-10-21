package cn.com.yzton.secondary.service.impl;

import cn.com.yzton.secondary.dao.EapUser2Dao;
import cn.com.yzton.secondary.entity.EapUser2;
import cn.com.yzton.secondary.entity.EapUser2Example;
import cn.com.yzton.secondary.service.EapUser2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.List;

@Service("EapUser2Service")
public class EapUser2ServiceImpl implements EapUser2Service {
    @Autowired(required = false)
    private EapUser2Dao eapUser2Dao;
    @Override
    public EapUser2 login(String name, String password, Boolean isadmin, Boolean actortype, Boolean isstoped) {
        EapUser2Example eapUser2Example = new EapUser2Example();
        EapUser2Example.Criteria criteria = eapUser2Example.createCriteria();
        if (name != null || !"".equals(name))
            criteria.andNameEqualTo(name);//账号
        //MD5加密
        String md5pwd = DigestUtils.md5DigestAsHex(password.getBytes());
        criteria.andPasswordEqualTo(md5pwd);
        criteria.andIsadminEqualTo(isadmin);//类型
        criteria.andActortypeEqualTo(actortype);//是否账套主管
        criteria.andIsstopedEqualTo(isstoped);//是否停用
        EapUser2 eapUser2 = eapUser2Dao.loginSelectByExample(eapUser2Example);
        if (eapUser2 != null || !"".equals(eapUser2)) {
            long now = System.currentTimeMillis();
            long start = eapUser2.getLastmodifydate().getTime();
            if (now >= start) {
                //更新登录时间
                EapUser2 eap_User = new EapUser2();
                eap_User.setId(eapUser2.getId());
                eap_User.setLastlogindate(new Date(System.currentTimeMillis()));
                eapUser2Dao.updateByPrimaryKeySelective(eap_User);
                return eapUser2;
            }
        }
        return null;
    }

    @Override
    public List<EapUser2> selectByExample(EapUser2Example example) {
        return eapUser2Dao.selectByExample(example);
    }
}
