package com.freedom.pattern.observer;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/11 23:15
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.attach(new ConcreteObserver(concreteSubject,"x"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject,"y"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject,"z"));
        concreteSubject.setSubjectState("new subject state");
        concreteSubject.notice();

    }
}
