package com.gupaoedu.vip.pattern.test.register;

import com.gupaoedu.vip.pattern.singleton.inner.InnerSingleton;
import com.gupaoedu.vip.pattern.singleton.register.EnumSingleton;

public class TestEnumSingleton {
    public static void main(String[] args) {
        EnumSingleton enumSingleton1 = EnumSingleton.newInstance();
        enumSingleton1.setData(new Object());
        EnumSingleton enumSingleton2 = EnumSingleton.newInstance();
        enumSingleton2.setData(new Object());
        System.out.println(enumSingleton1.getData().hashCode());
        System.out.println(enumSingleton2.getData().hashCode());
        System.out.println(enumSingleton1 == enumSingleton2);

        //多线程安全测试
        for (int i = 0; i < 10; i++){
            new Thread(()-> System.out.println(EnumSingleton.newInstance().getData())).start();
        }

    }
}
