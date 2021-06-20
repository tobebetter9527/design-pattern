package com.freedom.pattern.state;

import javax.swing.*;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/12 10:18
 */
public class ClosingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENNING_STATE);
        super.context.getLiftState().open();
    }
    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }
    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.getLiftState().run();
    }
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPING_STATE);
        super.context.getLiftState().stop();
    }
}
