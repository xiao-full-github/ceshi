package cn.com.yzton.utils;

import java.util.UUID;

/*
    UUID生成的随机字符串工具类
 */
public class UUIDUtils {
    /*
        静态方法
        获取一个UUID生成的随机字符串
     */
    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
