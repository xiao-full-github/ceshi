package cn.com.yzton.primary.service.impl;

import cn.com.yzton.primary.dao.EapConfigPathDao;
import cn.com.yzton.primary.entity.EapConfigPath;
import cn.com.yzton.primary.entity.EapConfigPathExample;
import cn.com.yzton.primary.service.EapConfigPathService;
import cn.com.yzton.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service("EapConfigPathService")
@Transactional
public class EapConfigPathServiceImpl implements EapConfigPathService {
    @Autowired(required = false)
    private EapConfigPathDao eapConfigPathDao;

    @Override
    public int insertSelective(EapConfigPath record) {
        //id(UUID随机生成)
        record.setId(UUIDUtils.getUUID());
        //时间(系统当前时间)
        record.setAdminlastlogindate(new Date(System.currentTimeMillis()));
        return eapConfigPathDao.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(EapConfigPath record) {
        return eapConfigPathDao.updateByPrimaryKeySelective(record);
    }


}
