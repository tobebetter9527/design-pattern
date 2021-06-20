package com.freedom.pattern.chain;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/07 23:13
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger() {
        super(AbstractLogger.ERROR);
    }

    @Override
    public void write(String msg) {
        System.out.println("Level =" + level + ",error msg = " + msg);
    }
}
