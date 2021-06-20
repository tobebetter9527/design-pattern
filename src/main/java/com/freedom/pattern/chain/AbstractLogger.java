package com.freedom.pattern.chain;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/07 23:00
 */
public abstract class AbstractLogger {
    protected static int DEBUG = 1;
    protected static int INFO = 2;
    protected static int ERROR = 3;
    protected int level = 0;
    protected AbstractLogger logger;

    public AbstractLogger(int level) {
        this.level = level;
    }


    public void handleRequest(int level, String msg) {
        if (this.level <= level) {
            write(msg);
        } else {
            if (this.logger != null) {
                this.logger.handleRequest(level, msg);
            }
        }
    }

    public abstract void write(String msg);

    public void setLogger(AbstractLogger logger) {
        this.logger = logger;
    }
}

