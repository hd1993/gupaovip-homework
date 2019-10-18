package com.gupaoedu.vip.pattern.singleton.lazy;

public class ThreadSafeSingletonLazy1 {

    private static ThreadSafeSingletonLazy1 INSTANCE;

    private ThreadSafeSingletonLazy1(){}

    public static synchronized ThreadSafeSingletonLazy1 newInstance(){
        if (null == INSTANCE){
            INSTANCE = new ThreadSafeSingletonLazy1();
        }
        return INSTANCE;
    }

}
