package com.designpattern.pattern.factorymethod;

/**
 * Created by liyimeng on 2016/12/9.
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的...");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话,一般都是单字节...");
    }
}
