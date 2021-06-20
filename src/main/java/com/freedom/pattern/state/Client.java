package com.freedom.pattern.state;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/12 10:39
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.OPENNING_STATE);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
