package com.designpattern.pattern.abstractfactory;

/**
 * Created by liyimeng on 2016/12/12.
 */
public class FemalFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new FemalYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        //同上，代码类似
        return null;
    }

    @Override
    public Human createBlackHuman() {
        //同上，代码类似
        return null;
    }
}
