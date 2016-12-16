package com.designpattern.pattern.proxy.code5;

import com.designpattern.pattern.proxy.code1.GamePlayer;
import com.designpattern.pattern.proxy.code1.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by liyimeng on 2016/12/16.
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("zhangsan");
        InvocationHandler handler = new GamePlayIH(player);
        ClassLoader cl = player.getClass().getClassLoader();
        IGamePlayer proxyInstance = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
        proxyInstance.login("zhangsan", "123123123");
        proxyInstance.killBoss();
        proxyInstance.upgrade();
    }
}
