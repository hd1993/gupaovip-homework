package com.gupaoedu.vip.pattern.test.hungry;

import com.gupaoedu.vip.pattern.singleton.hungry.SingletonHungry;

public class TestHungrySingleton {

    public static void main(String[] args) {
        SingletonHungry singletonHungry1 = SingletonHungry.newInstance();
        SingletonHungry singletonHungry2 = SingletonHungry.newInstance();

        System.out.println(singletonHungry1.hashCode());
        System.out.println(singletonHungry2.hashCode());
        System.out.println(singletonHungry1 == singletonHungry2);

        //多线程安全测试
        for (int i = 0; i < 5; i++){
            new Thread(()-> System.out.println(SingletonHungry.newInstance().hashCode())).start();
        }

    }
}
