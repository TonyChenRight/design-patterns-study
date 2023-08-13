package com.tony.design.patterns.study.creational.builder;

public class SimpleComputerBuilder {
    Computer computer;

    public SimpleComputerBuilder() {
        computer = new Computer();
    }

    public SimpleComputerBuilder motherBoard(String motherBoard){
        computer.setMotherboard(motherBoard);
        return this;
    }
    public SimpleComputerBuilder cpu(String cpu){
        computer.setCpu(cpu);
        return this;
    }
    public SimpleComputerBuilder memory(String memory){
        computer.setMemory(memory);
        return this;
    }
    public SimpleComputerBuilder disk(String disk){
        computer.setDisk(disk);
        return this;
    }
    public SimpleComputerBuilder gpu(String gpu){
        computer.setGpu(gpu);
        return this;
    }
    public SimpleComputerBuilder power(String power){
        computer.setPower(power);
        return this;
    }
    public SimpleComputerBuilder heatSink(String heatSink){
        computer.setHeatSink(heatSink);
        return this;
    }
    public SimpleComputerBuilder chassis(String chassis){
        computer.setChassis(chassis);
        return this;
    }
    public Computer build(){
        return computer;
    }
}
