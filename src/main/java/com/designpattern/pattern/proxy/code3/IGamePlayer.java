package com.designpattern.pattern.proxy.code3;

/**
 * Created by liyimeng on 2016/12/15.
 */
public interface IGamePlayer {
    //登录
    void login(String user, String password);

    //杀怪
    void killBoss();

    //升级
    void upgrade();

    //获得自己的代理
    IGamePlayer getProxy();
}
