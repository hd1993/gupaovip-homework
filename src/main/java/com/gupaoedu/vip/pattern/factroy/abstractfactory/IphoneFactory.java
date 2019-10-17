package com.gupaoedu.vip.pattern.factroy.abstractfactory;

public class IphoneFactory implements CellPhoneAbstractFactory {
    @Override
    public Ram createRam() {
        return new IphoneRam();
    }

    @Override
    public Rom createRom() {
        return new IphoneRom();
    }
}
