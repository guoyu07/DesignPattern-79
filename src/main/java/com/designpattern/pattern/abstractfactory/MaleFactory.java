package com.designpattern.pattern.abstractfactory;

/**
 * Created by liyimeng on 2016/12/12.
 */
public class MaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
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
