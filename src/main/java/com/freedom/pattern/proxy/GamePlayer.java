package com.freedom.pattern.proxy;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/05 10:35
 */
public class GamePlayer implements IGamePlayer {
    private String username;

    public GamePlayer(String username) {
        this.username = username;
    }
    @Override
    public void login(String username, String password) {
        System.out.println(username + " login");
    }

    @Override
    public void killBoss() {
        System.out.println(username + " kill boss");
    }

    @Override
    public void upgrade() {
        System.out.println(username + " upgrade");
    }
}
