package com.gupaoedu.vip.pattern.factroy.abstractfactory;

public class XiaomiFactory implements CellPhoneAbstractFactory {
    @Override
    public Ram createRam() {
        return new XiaomiRam();
    }

    @Override
    public Rom createRom() {
        return new XiaomiRom();
    }
}
