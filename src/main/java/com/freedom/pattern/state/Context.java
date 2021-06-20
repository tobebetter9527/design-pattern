package com.freedom.pattern.state;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/12 10:09
 */
public class Context {
    public static final OpenningState OPENNING_STATE = new OpenningState();
    public static final ClosingState CLOSING_STATE = new ClosingState();
    public static final RunningState RUNNING_STATE = new RunningState();
    public static final StopingState STOPING_STATE = new StopingState();
    private LiftState liftState;
    public LiftState getLiftState() {
        return this.liftState;
    }
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        // 把当前环境通知到各个实现类中
        this.liftState.setContext(this);
    }
    public void open() {
        this.liftState.open();
    }
    public void close() {
        this.liftState.close();
    }
    public void run() {
        this.liftState.run();
    }
    public void stop() {
        this.liftState.stop();
    }
}
