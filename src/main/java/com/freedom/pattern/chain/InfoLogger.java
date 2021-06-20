package com.freedom.pattern.chain;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/07 23:13
 */
public class InfoLogger extends AbstractLogger {
    public InfoLogger() {
        super(AbstractLogger.INFO);
    }

    @Override
    public void write(String msg) {
        System.out.println("Level =" + level + ",info msg = " + msg);
    }
}
