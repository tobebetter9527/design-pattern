package com.freedom.pattern.state;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/12 10:18
 */
public class RunningState extends LiftState {
    @Override
    public void open() {
        // do nothing
    }
    @Override
    public void close() {
        // do nothing
    }
    @Override
    public void run() {
        System.out.println("电梯运行。。。");
    }
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPING_STATE);
        super.context.getLiftState().stop();
    }
}
