package com.freedom.pattern.factory;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/06/28 22:47
 */
public class BlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("BlackHuman is black");
    }

    @Override
    public void talk() {
        System.out.println("BlackHuman talk");
    }
}
