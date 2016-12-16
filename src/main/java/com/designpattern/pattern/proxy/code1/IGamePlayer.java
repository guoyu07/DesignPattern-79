package com.designpattern.pattern.proxy.code1;

/**
 * 广大游戏玩家
 * Created by liyimeng on 2016/12/14.
 */
public interface IGamePlayer {
    //登录
    void login(String user, String password);

    //杀怪
    void killBoss();

    //升级
    void upgrade();
}
