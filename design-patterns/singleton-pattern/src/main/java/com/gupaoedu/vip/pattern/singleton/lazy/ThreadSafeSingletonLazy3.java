package com.gupaoedu.vip.pattern.singleton.lazy;

public class ThreadSafeSingletonLazy3 {
    private static ThreadSafeSingletonLazy3 INSTANCE;

    private ThreadSafeSingletonLazy3(){}

    public static  ThreadSafeSingletonLazy3 newInstance(){
        if (null == INSTANCE){
            synchronized (ThreadSafeSingletonLazy3.class){
                if (null == INSTANCE){
                    INSTANCE = new ThreadSafeSingletonLazy3();
                }
            }
        }
        return INSTANCE;
    }
}
