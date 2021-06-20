package com.freedom.pattern.command;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/07 21:53
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
