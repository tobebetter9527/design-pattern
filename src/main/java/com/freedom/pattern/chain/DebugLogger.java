package com.freedom.pattern.chain;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/07 23:13
 */
public class DebugLogger extends AbstractLogger {
    public DebugLogger() {
        super(AbstractLogger.DEBUG);
    }

    @Override
    public void write(String msg) {
        System.out.println("Level =" + level + ",debug msg = " + msg);
    }
}
