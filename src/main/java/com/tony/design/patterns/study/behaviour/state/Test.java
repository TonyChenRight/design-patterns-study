package com.tony.design.patterns.study.behaviour.state;

public class Test {
    public static void main(String[] args) {
        Context context=new Context();
        context.setLiftState(new CloseState());

        //电梯门打开了
        //电梯门关闭了!
        //电梯正在运行...
        //电梯停止了!
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
