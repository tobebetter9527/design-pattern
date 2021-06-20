package com.freedom.pattern.decorator;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/08 23:17
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator(component);
        component.action();
        component.operation();
    }
}
