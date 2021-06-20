package com.freedom.pattern.decorator;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/08 23:12
 */
public abstract class Decorator implements Component {
    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }
    @Override
    public void operation() {
        this.component.operation();
    }

    @Override
    public void action() {
        this.component.action();
    }
}
