package com.designpattern.pattern.proxy.code6;


import java.lang.reflect.InvocationHandler;

/**
 * Created by liyimeng on 2016/12/16.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler handler = new MyInvocationHandler(subject);
        ClassLoader loader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        Subject subjectProxy = DynamicProxy.newProxyInstance(loader, interfaces, handler);
        subjectProxy.doSomething("hahahahah");

        Subject subject1 = new RealSubject();
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject1);
        proxy.doSomething("123123123222");
    }
}
