package com.gupaedu.vip.pattern.factory;

import com.gupaoedu.vip.pattern.factroy.Cellphone;
import com.gupaoedu.vip.pattern.factroy.simplefactory.CellPhoneFactory;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        Cellphone cellphone = new CellPhoneFactory().newInstance("Huawei");
        Cellphone cellphone1 = new CellPhoneFactory().newInstance("Iphone");
        Cellphone cellphone2 = new CellPhoneFactory().newInstance("Xiaomi");

        System.out.println(cellphone);
        System.out.println(cellphone1);
        System.out.println(cellphone2);
    }

}
