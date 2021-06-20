package com.freedom.pattern.command;

/**
 * @author tobebetter9527
 * @description TODO
 * @create 2020/07/07 21:52
 */
public class ConcreteCommand extends Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
