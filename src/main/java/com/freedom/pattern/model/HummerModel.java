package com.freedom.pattern.model;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/04 17:16
 */
public abstract class HummerModel {
    public abstract void start();
    public abstract void stop();
    public abstract void engineBoom();
    public abstract void alarm();
    public void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
