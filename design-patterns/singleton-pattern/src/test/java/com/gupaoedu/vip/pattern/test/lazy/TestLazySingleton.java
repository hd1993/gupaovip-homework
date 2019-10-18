package com.gupaoedu.vip.pattern.test.lazy;

import com.gupaoedu.vip.pattern.singleton.hungry.SingletonHungry;
import com.gupaoedu.vip.pattern.singleton.lazy.ThreadSafeSingletonLazy3;

public class TestLazySingleton {

    public static void main(String[] args) {
//        UnsafeSingletonLazy unsafeSingletonLazy1 = UnsafeSingletonLazy.newInstance();
//        UnsafeSingletonLazy unsafeSingletonLazy2 = UnsafeSingletonLazy.newInstance();
//
//        System.out.println(unsafeSingletonLazy1 == unsafeSingletonLazy2);

        //多线程安全测试
//        for (int i = 0; i < 10; i++){
//            new Thread( () -> System.out.println(UnsafeSingletonLazy.newInstance())).start();
//        }

//        for (int i = 0; i < 10; i++){
//            new Thread( () -> System.out.println(ThreadSafeSingletonLazy1.newInstance())).start();
//        }

//        for (int i = 0; i < 10; i++){
//            new Thread( () -> System.out.println(ThreadSafeSingletonLazy2.newInstance())).start();
//        }

        for (int i = 0; i < 10; i++){
            new Thread( () -> System.out.println(ThreadSafeSingletonLazy3.newInstance())).start();
        }
    }
}
