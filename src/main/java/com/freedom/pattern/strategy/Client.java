package com.freedom.pattern.strategy;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/09 22:28
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context("StrategyA");
        context.doSomething();
    }
}
