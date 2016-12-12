package com.designpattern.pattern.abstractfactory;

/**
 * Created by liyimeng on 2016/12/12.
 */
public abstract class AbstractYellowHuman implements Human{

    public void getColor() {
        System.out.println("黄色。。。。");
    }

    public void talk() {
        System.out.println("双字节。。。");
    }
}
