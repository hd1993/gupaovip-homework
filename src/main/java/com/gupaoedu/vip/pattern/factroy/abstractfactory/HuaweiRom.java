package com.gupaoedu.vip.pattern.factroy.abstractfactory;

public class HuaweiRom implements Rom {
    @Override
    public void readOnlyMemory() {
        System.out.println("Huawei Rom: 256G");
    }
}
