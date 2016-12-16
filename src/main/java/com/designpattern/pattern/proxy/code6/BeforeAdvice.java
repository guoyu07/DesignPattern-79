package com.designpattern.pattern.proxy.code6;

/**
 * Created by liyimeng on 2016/12/16.
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("执行了前置通知。。。。。");
    }
}
