package com.gupaoedu.vip.pattern.test.container;

import com.gupaoedu.vip.pattern.singleton.register.ContainerSingleton;

public class TestContainerSingleton {

    public static void main(String[] args) {
//        Object object1 = ContainerSingleton.getBean("Pojo");
//        Object object2 = ContainerSingleton.getBean("Pojo");
//        Object object3 = ContainerSingleton.getBean("Pojo");
//        Object object4 = ContainerSingleton.getBean("Pojo");
//
//        System.out.println(object1);
//        System.out.println(object2);
//        System.out.println(object3);
//        System.out.println(object4);

        try {
            long start = System.currentTimeMillis();
            ConcurrentExecutor.execute(() ->{
                    Object obj = ContainerSingleton.getInstance("Pojo");
                    System.out.println(System.currentTimeMillis() + ": " + obj);
            }, 10,6);
            long end = System.currentTimeMillis();
            System.out.println("总耗时：" + (end - start) + " ms.");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
