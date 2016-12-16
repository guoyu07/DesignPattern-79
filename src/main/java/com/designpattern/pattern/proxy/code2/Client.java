package com.designpattern.pattern.proxy.code2;

import com.designpattern.pattern.proxy.code1.IGamePlayer;

/**
 * Created by liyimeng on 2016/12/15.
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy("zhangsan");
        proxy.login("zhangsan22222", "zhangsan");
        proxy.killBoss();
        proxy.upgrade();
    }
}
