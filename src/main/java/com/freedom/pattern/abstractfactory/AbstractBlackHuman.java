package com.freedom.pattern.abstractfactory;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/06/29 23:41
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("black human");
    }

    @Override
    public void talk() {
        System.out.println("black human talk");
    }
}
