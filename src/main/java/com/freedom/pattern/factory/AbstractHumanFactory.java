package com.freedom.pattern.factory;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/06/28 22:50
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
