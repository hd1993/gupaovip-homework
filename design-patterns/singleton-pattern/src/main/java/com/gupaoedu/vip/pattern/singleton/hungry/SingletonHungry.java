package com.gupaoedu.vip.pattern.singleton.hungry;

//饿汉式单例
public class SingletonHungry {

    private static final SingletonHungry INSTANCE = new SingletonHungry();

    private SingletonHungry(){}

    public static SingletonHungry newInstance(){
        return INSTANCE;
    }

}
