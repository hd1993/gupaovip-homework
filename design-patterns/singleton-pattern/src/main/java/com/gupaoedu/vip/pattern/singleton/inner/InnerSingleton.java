package com.gupaoedu.vip.pattern.singleton.inner;

public class InnerSingleton {

    private InnerSingleton(){}

    public static final InnerSingleton newInstance(){
        return InstanceHolder.INSTANCE;
    }

    private static final class InstanceHolder{
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }


}
