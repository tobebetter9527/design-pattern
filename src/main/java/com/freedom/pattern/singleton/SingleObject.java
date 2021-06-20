package com.freedom.pattern.singleton;

/**
 * @author tobebetter9527
 * @description 单例
 * @create 2020/06/28 22:10
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {

    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println(instance);
    }
}
