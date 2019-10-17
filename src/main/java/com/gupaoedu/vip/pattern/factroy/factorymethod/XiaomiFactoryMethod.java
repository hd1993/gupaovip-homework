package com.gupaoedu.vip.pattern.factroy.factorymethod;

import com.gupaoedu.vip.pattern.factroy.Cellphone;
import com.gupaoedu.vip.pattern.factroy.Xiaomi;

public class XiaomiFactoryMethod implements CellphoneFactoryMethod {
    @Override
    public Cellphone getCellphone() {
        return new Xiaomi();
    }
}
