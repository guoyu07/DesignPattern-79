package com.designpattern.pattern.proxy.code6;

/**
 * Created by liyimeng on 2016/12/16.
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("doSomething : " + str);
    }
}
