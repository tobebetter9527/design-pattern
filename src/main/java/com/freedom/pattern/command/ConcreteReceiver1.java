package com.freedom.pattern.command;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/06 23:27
 */
public class ConcreteReceiver1 extends Receiver {
    @Override
    public void doSomething() {
        System.out.println("concreteReceiver1 do something");
    }
}
