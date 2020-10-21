package cn.com.yzton.primary.service.impl;

import cn.com.yzton.primary.dao.EapUserDao;
import cn.com.yzton.primary.entity.EapUser;
import cn.com.yzton.primary.entity.EapUserExample;
import cn.com.yzton.primary.service.EapUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("EapUserService")
public class EapUserServiceImpl implements EapUserService {
    @Autowired(required = false)
    private EapUserDao eapUserDao;

}
