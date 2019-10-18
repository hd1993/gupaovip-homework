package com.gupaoedu.vip.pattern.factroy.abstractfactory;

public class IphoneRom implements Rom {
    @Override
    public void readOnlyMemory() {
        System.out.println("Iphone Rom: 128G");
    }
}
