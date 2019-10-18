package com.gupaoedu.vip.pattern.test.threadlocal;

import com.gupaoedu.vip.pattern.singleton.threadlocal.ThreadLocalSingleton;
import com.gupaoedu.vip.pattern.test.container.ConcurrentExecutor;

public class TestThreadLocalSingleton {

    public static void main(String[] args) {

//        ThreadLocalSingleton tls1 =  ThreadLocalSingleton.getInstance();
//        ThreadLocalSingleton tls2 =  ThreadLocalSingleton.getInstance();
//        ThreadLocalSingleton tls3 =  ThreadLocalSingleton.getInstance();
//
//        System.out.println(tls1);
//        System.out.println(tls2);
//        System.out.println(tls3);

        try {
            long start = System.currentTimeMillis();
            ConcurrentExecutor.execute(() ->{
                Object obj = ThreadLocalSingleton.getInstance();
                System.out.println(System.currentTimeMillis() + ": " + obj);
            }, 10,6);
            long end = System.currentTimeMillis();
            System.out.println("总耗时：" + (end - start) + " ms.");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
