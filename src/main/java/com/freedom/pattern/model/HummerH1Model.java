package com.freedom.pattern.model;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/04 17:24
 */
public class HummerH1Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("H1 model start");
    }
    @Override
    public void stop() {
        System.out.println("H1 model stop");
    }
    @Override
    public void engineBoom() {
        System.out.println("H1 model engineBoom");
    }
    @Override
    public void alarm() {
        System.out.println("H1 model alarm");
    }
}
