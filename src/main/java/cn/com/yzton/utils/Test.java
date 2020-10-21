package cn.com.yzton.utils;

import java.util.UUID;

public class Test {

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String s = uuid.toString();
        System.out.println(s);
    }
}
