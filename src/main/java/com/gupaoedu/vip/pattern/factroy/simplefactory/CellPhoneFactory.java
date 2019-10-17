package com.gupaoedu.vip.pattern.factroy.simplefactory;

import com.gupaoedu.vip.pattern.factroy.Cellphone;
import com.gupaoedu.vip.pattern.factroy.Huawei;
import com.gupaoedu.vip.pattern.factroy.Iphone;
import com.gupaoedu.vip.pattern.factroy.Xiaomi;

public class CellPhoneFactory {

    public  Cellphone newInstance(String name){
       switch (name){
           case "Iphone" :
               return new Iphone();
           case "Huawei" :
               return new Huawei();
           case "Xiaomi" :
               return new Xiaomi();
           default:
               return null;
       }
    }

}
