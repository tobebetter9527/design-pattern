package com.freedom.pattern.model;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/04 17:24
 */
public class HummerH2Model extends HummerModel {

    @Override
    public void start() {
        System.out.println("H2 model start");
    }

    @Override
    public void stop() {
        System.out.println("H2 model stop");
    }

    @Override
    public void engineBoom() {
        System.out.println("H2 model engineBoom");
    }

    @Override
    public void alarm() {
        System.out.println("H2 model alarm");
    }
}
