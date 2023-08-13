package com.tony.design.patterns.study.behaviour.state;

public class CloseState extends LiftState{
    @Override
    public void open() {
        super.context.setLiftState(Context.OPEN_STATE);
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭了!");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUN_STATE);
        super.context.run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOP_STATE);
        super.context.stop();
    }
}
