package com.gupaedu.vip.pattern.factory;

import com.gupaoedu.vip.pattern.factroy.Cellphone;
import com.gupaoedu.vip.pattern.factroy.factorymethod.CellphoneFactoryMethod;
import com.gupaoedu.vip.pattern.factroy.factorymethod.HuaweiFactoryMethod;
import com.gupaoedu.vip.pattern.factroy.factorymethod.IphoneFactoryMethod;
import com.gupaoedu.vip.pattern.factroy.factorymethod.XiaomiFactoryMethod;

public class FactoryMethodTest {

    public static void main(String[] args) {

        CellphoneFactoryMethod factoryMethod = new HuaweiFactoryMethod();
        CellphoneFactoryMethod factoryMethod1 = new XiaomiFactoryMethod();
        CellphoneFactoryMethod factoryMethod2 = new IphoneFactoryMethod();
        Cellphone cellphone = factoryMethod.getCellphone();
        Cellphone cellphone1 = factoryMethod1.getCellphone();
        Cellphone cellphone2 = factoryMethod2.getCellphone();

        System.out.println(cellphone);
        System.out.println(cellphone1);
        System.out.println(cellphone2);

    }

}
