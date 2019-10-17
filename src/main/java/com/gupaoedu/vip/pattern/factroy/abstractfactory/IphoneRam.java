package com.gupaoedu.vip.pattern.factroy.abstractfactory;

public class IphoneRam implements Ram {
    @Override
    public void randomAccessMemory() {
        System.out.println("Iphone Ram: 2G");
    }
}
