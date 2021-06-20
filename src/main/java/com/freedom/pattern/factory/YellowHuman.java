package com.freedom.pattern.factory;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/06/28 22:47
 */
public class YellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("YellowHuman is yellow");
    }

    @Override
    public void talk() {
        System.out.println("YellowHuman talk");
    }
}
