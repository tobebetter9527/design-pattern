package com.freedom.pattern.facade;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/11 16:41
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
