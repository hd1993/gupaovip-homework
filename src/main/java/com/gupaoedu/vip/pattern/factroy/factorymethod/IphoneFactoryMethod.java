package com.gupaoedu.vip.pattern.factroy.factorymethod;

import com.gupaoedu.vip.pattern.factroy.Cellphone;
import com.gupaoedu.vip.pattern.factroy.Iphone;

public class IphoneFactoryMethod  implements CellphoneFactoryMethod{
    @Override
    public Cellphone getCellphone() {
        return new Iphone();
    }
}
