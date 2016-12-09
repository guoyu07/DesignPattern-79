package com.designpattern.pattern.factorymethod.code2;

import com.designpattern.pattern.factorymethod.code1.BlackHuman;
import com.designpattern.pattern.factorymethod.code1.Human;
import com.designpattern.pattern.factorymethod.code1.WhiteHuman;
import com.designpattern.pattern.factorymethod.code1.YellowHuman;

/**
 * Created by liyimeng on 2016/12/9.
 */
public class NvWa {
    public static void main(String[] args) {
        Human witheHuman = HumanFactory.createHuman(WhiteHuman.class);
        witheHuman.getColor();
        witheHuman.talk();
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
