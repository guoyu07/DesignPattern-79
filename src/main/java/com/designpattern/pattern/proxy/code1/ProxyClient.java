package com.designpattern.pattern.proxy.code1;

/**
 * Created by liyimeng on 2016/12/14.
 */
public class ProxyClient {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("zhansan");
        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(gamePlayer);
        gamePlayerProxy.login("zhangsan", "zhangsan");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
    }
}
