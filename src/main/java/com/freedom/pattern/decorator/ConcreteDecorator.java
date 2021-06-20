package com.freedom.pattern.decorator;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/08 23:16
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        this.method();
    }

    @Override
    public void action() {
        super.action();
    }

    private void method() {
        System.out.println("方法增强，改造或其他");
    }
}
