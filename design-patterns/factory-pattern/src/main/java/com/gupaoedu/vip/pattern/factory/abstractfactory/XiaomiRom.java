package com.gupaoedu.vip.pattern.factroy.abstractfactory;

public class XiaomiRom  implements Rom{
    @Override
    public void readOnlyMemory() {
        System.out.println("Xiaomi Rom: 64G");
    }
}
