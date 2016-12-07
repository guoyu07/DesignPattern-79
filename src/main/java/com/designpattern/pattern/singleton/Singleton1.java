package com.designpattern.pattern.singleton;

/**
 * 饿汉式单利(相对安全)
 * Created by liyimeng on 2016/12/7.
 */
public class Singleton1 {
    private static Singleton1 singleton = new Singleton1();

    private Singleton1() {

    }

    public Singleton1 getInstance() {
        return singleton;
    }
}
