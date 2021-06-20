package com.freedom.pattern.chain;

import javax.sound.sampled.Line;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/07 23:20
 */
public class Client {
    public static void main(String[] args) {
        ErrorLogger errorLogger = new ErrorLogger();
        InfoLogger infoLogger = new InfoLogger();
        DebugLogger debugLogger = new DebugLogger();
        errorLogger.setLogger(infoLogger);
        infoLogger.setLogger(debugLogger);

        errorLogger.handleRequest(1,"critical thinking");

    }
}
