package com.gupaoedu.vip.pattern.test.inner;

import com.gupaoedu.vip.pattern.singleton.hungry.SingletonHungry;
import com.gupaoedu.vip.pattern.singleton.inner.InnerSingleton;

public class TestInnerSingleton {

    public static void main(String[] args) {
//        InnerSingleton innerSingleton1 = InnerSingleton.newInstance();
//        InnerSingleton innerSingleton2 = InnerSingleton.newInstance();
//
//        System.out.println(innerSingleton1.hashCode());
//        System.out.println(innerSingleton2.hashCode());
//        System.out.println(innerSingleton1 == innerSingleton2);

        //多线程安全测试
        for (int i = 0; i < 10; i++){
            new Thread(()-> System.out.println(InnerSingleton.newInstance())).start();
        }

    }
}
