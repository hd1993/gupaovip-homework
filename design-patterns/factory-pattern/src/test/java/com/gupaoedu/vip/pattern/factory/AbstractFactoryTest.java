package com.gupaedu.vip.pattern.factory;

import com.gupaoedu.vip.pattern.factroy.abstractfactory.CellPhoneAbstractFactory;
import com.gupaoedu.vip.pattern.factroy.abstractfactory.XiaomiFactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        CellPhoneAbstractFactory factory = new XiaomiFactory();
        factory.createRam().randomAccessMemory();
        factory.createRom().readOnlyMemory();
    }
}
