package com.freedom.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/05 20:35
 */
public class GamePlayerIH implements InvocationHandler {

    private Object object;

    public GamePlayerIH(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.object, args);
    }
}
