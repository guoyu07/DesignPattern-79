package com.designpattern.pattern.factorymethod.code1;

/**
 * Created by liyimeng on 2016/12/9.
 */
public class BlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的...");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话,但是一般人听不懂...");
    }
}
