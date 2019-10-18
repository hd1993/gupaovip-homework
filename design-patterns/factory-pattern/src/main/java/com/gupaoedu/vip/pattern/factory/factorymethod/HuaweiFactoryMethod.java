package com.gupaoedu.vip.pattern.factroy.factorymethod;

import com.gupaoedu.vip.pattern.factroy.Cellphone;
import com.gupaoedu.vip.pattern.factroy.Huawei;

public class HuaweiFactoryMethod implements CellphoneFactoryMethod {
    @Override
    public Cellphone getCellphone() {
        return new Huawei();
    }
}
