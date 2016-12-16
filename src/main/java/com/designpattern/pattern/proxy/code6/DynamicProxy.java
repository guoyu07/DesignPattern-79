package com.designpattern.pattern.proxy.code6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by liyimeng on 2016/12/16.
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        if (true) {
            new BeforeAdvice().exec();
        }
        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }

}
