package com.designpattern.pattern.proxy.code1;

/**
 * Created by liyimeng on 2016/12/14.
 */
public class Client {
    public static void main(String[] args) {

        IGamePlayer gamePlayer = new GamePlayer("张三");
        gamePlayer.login("zhangsan","zhangsan");
        gamePlayer.killBoss();
        gamePlayer.upgrade();

    }
}
