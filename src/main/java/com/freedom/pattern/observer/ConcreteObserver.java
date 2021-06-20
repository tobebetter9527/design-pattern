package com.freedom.pattern.observer;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/11 23:11
 */
public class ConcreteObserver extends Observer {
    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者" + name + "新转态" + observerState);
    }
}
