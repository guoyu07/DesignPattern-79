package com.designpattern.pattern.proxy.code4;

import com.designpattern.pattern.proxy.code1.IGamePlayer;

/**
 * Created by liyimeng on 2016/12/16.
 */
public class IGamePlayerProxy implements IGamePlayer,IProxy {

    private IGamePlayer player = null;

    /**
     * 通过构造函数传递要对谁进行代理
     * @param player
     */
    public IGamePlayerProxy(IGamePlayer player) {
        this.player = player;
    }

    /**
     * 代理登录
     * @param user
     * @param password
     */
    @Override
    public void login(String user, String password) {
        this.player.login(user,password);
    }

    /**
     * 代理打怪
     */
    @Override
    public void killBoss() {
        this.player.killBoss();
    }

    /**
     * 代理升级
     */
    @Override
    public void upgrade() {
        this.player.upgrade();
        this.count();
    }

    /**
     * 计算费用，代理类自身的其他扩展。
     */
    @Override
    public void count() {
        System.out.println("升级总费用是：1000元。");
    }
}
