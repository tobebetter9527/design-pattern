package com.freedom.pattern.abstractfactory;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/06/29 23:41
 */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("yellow human");
    }

    @Override
    public void talk() {
        System.out.println("yellow human talk");
    }
}
