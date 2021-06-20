package com.freedom.pattern.command;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/07 21:58
 */
public class Client {
    public static void main(String[] args) {
        ConcreteReceiver1 concreteReceiver1 = new ConcreteReceiver1();
        ConcreteCommand concreteCommand = new ConcreteCommand(concreteReceiver1);
        Invoker invoker = new Invoker();
        invoker.setCommand(concreteCommand);
        invoker.action();
    }
}
