package com.designpattern.pattern.abstractfactory;

/**
 * Created by liyimeng on 2016/12/12.
 */
public abstract class AbstractWhiteHuman implements Human {

    public void getColor() {
        System.out.println("白色。。。");
    }

    public void talk() {
        System.out.println("单字节。。。。");
    }

}
