package com.designpattern.pattern.proxy.code1;

/**
 * Created by liyimeng on 2016/12/14.
 */
public class GamePlayerProxy implements IGamePlayer {

    IGamePlayer gamePlayer;

    /**
     * 构造方法，传入需要代理的玩家
     * @param gamePlayer
     */
    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    /**
     * 代理登录
     * @param user
     * @param password
     */
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }

    /**
     * 代理打怪
     */
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    /**
     * 代理升级
     */
    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
