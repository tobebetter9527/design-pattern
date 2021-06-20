package com.freedom.pattern.factory;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/06/28 22:47
 */
public class WhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("WhiteHuman is white");
    }

    @Override
    public void talk() {
        System.out.println("WhiteHuman talk");
    }
}
