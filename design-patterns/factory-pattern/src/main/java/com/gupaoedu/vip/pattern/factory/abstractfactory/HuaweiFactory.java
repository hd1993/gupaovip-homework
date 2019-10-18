package com.gupaoedu.vip.pattern.factroy.abstractfactory;

public class HuaweiFactory implements CellPhoneAbstractFactory {
    @Override
    public Ram createRam() {
        return new HuaweiRam();
    }

    @Override
    public Rom createRom() {
        return  new HuaweiRom();
    }
}
