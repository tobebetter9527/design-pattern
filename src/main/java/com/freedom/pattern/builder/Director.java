package com.freedom.pattern.builder;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/11 17:37
 */
public class Director {
    // 建造过程
    public void construct(Builder builder) {
        builder.buildA();
        builder.buildB();
    }
}
