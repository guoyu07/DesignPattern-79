package com.designpattern.pattern.prototype.code3;

/**
 * 通过 clone 方法创建对象，构造方法不会被执行。
 * 是直接从堆内存中，以二进制流的方式进行拷贝，
 * 重新分配一个内存块。
 * Created by liyimeng on 2016/12/16.
 */
public class Client {
    public static void main(String[] args) {
        ClassA c = new ClassA();
        c.setValue("aaa");
        ClassA b = c.clone();
        c.setValue("bbbb");
        System.out.println(b.getValue().size());
        System.out.println(b.getAge());
        c.setAge(1);
        System.out.println(b.getAge());
    }
}
