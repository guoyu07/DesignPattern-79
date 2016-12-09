package com.designpattern.pattern.factorymethod.code1;

/**
 * 抽象人类创建工厂
 * Created by liyimeng on 2016/12/9.
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
