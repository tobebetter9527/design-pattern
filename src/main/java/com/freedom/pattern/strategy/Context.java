package com.freedom.pattern.strategy;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/09 22:25
 */
public class Context {
    private Strategy strategy;

    public Context(String strategyName) {
        if ("StrategyA".equals(strategyName)) {
            this.strategy = new ConcreteStrategyA();
        } else if ("StrategyB".equals(strategyName)) {
            this.strategy = new ConcreteStrategyB();
        }
    }

    public void doSomething() {
        strategy.algorithm();
    }
}
