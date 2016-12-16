package com.designpattern.pattern.proxy.code3;

/**
 * 强制代理，由接口实现自身管理代理类。代理类由接口创建并提供。
 * Created by liyimeng on 2016/12/16.
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("zhangsan");

        /**
         * 这样不行,因为接口里做了限制，必须由代理接口里面的代理对象来访问。
         */
        player.login("zhangsan","123123123");
        player.killBoss();
        player.upgrade();

        /**
         * 这样也不行，理由同上。
         */
        IGamePlayer proxy = new GamePlayerProxy(player);
        proxy.login("zhangsan","123123");
        proxy.killBoss();
        proxy.upgrade();

        /**
         * 这样才行
         */
        IGamePlayer proxy1 = player.getProxy();
        proxy1.login("zhangsan","123123123123123");
        proxy1.killBoss();
        proxy1.upgrade();
    }
}
