package com.designpattern.pattern.factorymethod;

/**
 * Created by liyimeng on 2016/12/9.
 */
public class YellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的...");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种会说话,一般都是双字节...");
    }
}
