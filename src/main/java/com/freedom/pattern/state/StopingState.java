package com.freedom.pattern.state;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/12 10:18
 */
public class StopingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENNING_STATE);
        super.context.getLiftState().open();
    }
    @Override
    public void close() {
        // do nothing
    }
    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.getLiftState().run();
    }
    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }
}
