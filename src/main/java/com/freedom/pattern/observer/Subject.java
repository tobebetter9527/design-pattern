package com.freedom.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/11 23:02
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    public void notice() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
