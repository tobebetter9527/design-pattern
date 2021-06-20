package com.freedom.pattern.state;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/12 10:18
 */
public class OpenningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门开启");
    }
    @Override
    public void close() {
        // 环境状态的变化
        super.context.setLiftState(Context.CLOSING_STATE);
        // 动作委托给OPENNING_STATE完成
        super.context.getLiftState().close();
    }
    @Override
    public void run() {
        // do nothing
    }
    @Override
    public void stop() {
        // do nothing
    }
}
