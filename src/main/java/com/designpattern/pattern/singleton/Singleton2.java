package com.designpattern.pattern.singleton;

/**
 * 懒汉式单例(相对不安全)
 * Created by liyimeng on 2016/12/7.
 */
public class Singleton2 {
    private static Singleton2 singleton = null;

    private Singleton2() {

    }

    public Singleton2 getInstance() {
        synchronized (this) {
            if (singleton == null) {
                singleton = new Singleton2();
            }
        }
        return singleton;
    }
}
