package com.gupaoedu.vip.pattern.singleton.lazy;

//线程不安全的懒汉式单例
public class UnsafeSingletonLazy {

    private static UnsafeSingletonLazy INSTANCE;

    private UnsafeSingletonLazy(){}

    public static UnsafeSingletonLazy newInstance(){
        if (null == INSTANCE){
            INSTANCE = new UnsafeSingletonLazy();
        }
        return INSTANCE;
    }

}
