package com.designpattern.pattern.proxy.code1;

/**
 * 具体游戏玩家
 * Created by liyimeng on 2016/12/14.
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("用户" + this.name + " 登录了游戏！");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + " 在打怪升级。。。");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " 又升了一级！！！");
    }
}
