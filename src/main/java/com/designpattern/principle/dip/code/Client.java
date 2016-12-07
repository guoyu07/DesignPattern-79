package com.designpattern.principle.dip.code;

/**
 * Client属于高层业务逻辑,它对低层模块的依赖都应该建立在抽象上IDriver,ICar
 * Created by liyimeng on 2016/12/3.
 */
public class Client {

    public static void main(String[] args) {

        IDriver zhangsan = new Driver();
        ICar benz = new BMW();
        zhangsan.drive(benz);

    }

}
