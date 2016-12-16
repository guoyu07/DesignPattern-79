package com.designpattern.pattern.proxy.code6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by liyimeng on 2016/12/16.
 */
public class MyInvocationHandler implements InvocationHandler {

    /**
     * 被代理的类
     */
    public Object object;

    /**
     * 通过构造方法传入被代理的类。
     * @param object
     */
    public MyInvocationHandler(Object object) {
        this.object = object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.object, args);
    }
}
