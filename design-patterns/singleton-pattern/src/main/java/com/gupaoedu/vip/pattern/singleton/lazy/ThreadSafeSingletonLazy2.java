package com.gupaoedu.vip.pattern.singleton.lazy;

public class ThreadSafeSingletonLazy2 {
    private static ThreadSafeSingletonLazy2 INSTANCE;

    private ThreadSafeSingletonLazy2(){}

    public static  ThreadSafeSingletonLazy2 newInstance(){
        synchronized (ThreadSafeSingletonLazy2.class){
            if (null == INSTANCE){
                INSTANCE = new ThreadSafeSingletonLazy2();
            }
        }
        return INSTANCE;
    }
}
