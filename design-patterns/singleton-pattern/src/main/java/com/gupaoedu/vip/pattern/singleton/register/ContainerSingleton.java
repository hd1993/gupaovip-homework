package com.gupaoedu.vip.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private static final Map<String ,Object> IOC = new ConcurrentHashMap<>();

    private ContainerSingleton(){}

    public static Object getInstance(String className){
        synchronized (className){
            if (!IOC.containsKey(className)){
                Object obj = null;
                try{
                    obj = Class.forName(className).newInstance();
                    IOC.put(className, obj);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return obj;
            }else {
                return IOC.get(className);
            }
        }

    }

}
