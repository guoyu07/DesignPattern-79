package com.designpattern.pattern.proxy.code5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理，需要实现 InvocationHandler 接口，重写invoke方法。
 * Created by liyimeng on 2016/12/16.
 */
public class GamePlayIH implements InvocationHandler {

    /**
     * 被代理类
     */
    private Class cls = null;

    /**
     * 被代理类对象
     */
    private Object obj = null;

    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人登录了我的账号。。。");
        }
        return result;
    }
}
