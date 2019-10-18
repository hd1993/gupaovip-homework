package com.gupaoedu.vip.pattern.factroy.abstractfactory;

public class HuaweiRam implements Ram {
    @Override
    public void randomAccessMemory() {
        System.out.println("Huawei Ram: 4G");
    }
}
