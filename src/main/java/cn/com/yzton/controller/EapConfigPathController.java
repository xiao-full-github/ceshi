package cn.com.yzton.controller;

import cn.com.yzton.primary.entity.EapConfigPath;
import cn.com.yzton.primary.service.EapConfigPathService;
import cn.com.yzton.utils.MessageConstant;
import cn.com.yzton.utils.Result;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/EapConfigPath")
public class EapConfigPathController {
    @Autowired(required = false)
    private EapConfigPathService eapConfigPathService;

    public Result query(@RequestBody EapConfigPath eapConfigPath){
        try {
//            eapConfigPathService.eapConfigPathSelectByExample()
            return new Result(true,MessageConstant.QUERY_EAPCONFIGPATH_SUCCESS);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,MessageConstant.QUERY_EAPCONFIGPATH_FAIL);
        }
    }

    /*
        添加数据库配置信息
        字段
            dataUser 数据库登用户名    （获取数据库登用户名）
            serviceid 服务器ID     MTMuMDAwLjAwMC4wMDAxOzIwMjAtMTAtMTUgMTU6MTQ=
            sysversionno 系统版本号  13.000.000.0001
            skinvalue 皮肤值      ""
            adminpassword   管理员登陆密码
            upgradepwdstate 密码升级状态  1
            domainName 域名
            codelength  账套长度    6
            adminlastlogindate  管理员最后登陆日期   (获取当前系统系统)
            databaseserver  数据库服务器名或IP      .
            alias   别名      Data
            dataPwd 数据库登录密码     （获取密码进行加密）
            machineName 机器名     null
            path    数据库路径   （获取数据库路径）
            userName    用户名 null
            password    密码   null
            islocal 是否是本地       True
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Result insert(@RequestBody EapConfigPath eapConfigPath) {
        try {
            eapConfigPathService.insertSelective(eapConfigPath);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.ADD_EAPCONFIGPATH_FAIL);
        }
        return new Result(true, MessageConstant.ADD_EAPCONFIGPATH_SUCCESS);
    }

    /*
        修改密码
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public Result edit(@RequestBody EapConfigPath eapConfigPath) {
        try {
            eapConfigPathService.updateByPrimaryKeySelective(eapConfigPath);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.EDIT_EAPCONFIGPATH_FAIL);
        }
        return new Result(true, MessageConstant.EDIT_EAPCONFIGPATH_SUCCESS);
    }
}
