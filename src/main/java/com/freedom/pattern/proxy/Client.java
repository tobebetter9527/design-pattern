package com.freedom.pattern.proxy;

import java.lang.reflect.Proxy;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/05 10:38
 */
public class Client {
    public static void main(String[] args) {
        GamePlayer zhangsan = new GamePlayer("zhangsan");
        GamePlayerIH gamePlayerIH = new GamePlayerIH(zhangsan);
        ClassLoader classLoader = zhangsan.getClass().getClassLoader();
        IGamePlayer proxyInstance = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, gamePlayerIH);
        proxyInstance.login("zhangsan","password");
        proxyInstance.killBoss();
        proxyInstance.upgrade();
    }

    private static void process() {
        GamePlayer zhangsan = new GamePlayer("zhangsan");
        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(zhangsan);
        gamePlayerProxy.login("zhangsan", "password");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
    }
}
