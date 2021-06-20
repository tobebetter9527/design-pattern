package com.freedom.pattern.decorator;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/08 23:11
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent operation");
    }

    @Override
    public void action() {
        System.out.println("ConcreteComponent action");
    }
}
