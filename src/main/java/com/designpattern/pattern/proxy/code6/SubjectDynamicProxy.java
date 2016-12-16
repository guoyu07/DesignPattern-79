package com.designpattern.pattern.proxy.code6;

import java.lang.reflect.InvocationHandler;

/**
 * 具体业务的动态代理
 * Created by liyimeng on 2016/12/16.
 */
public class SubjectDynamicProxy extends DynamicProxy {

    public static <T> T newProxyInstance(Subject subject) {
        ClassLoader loader = subject.getClass().getClassLoader();
        Class[] interfaces = subject.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader, interfaces, handler);
    }

}
