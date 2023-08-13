package com.tony.design.patterns.study.structural.bridge;

public class Rmvb implements Video{
    @Override
    public void decode(String fileName) {
        System.out.println("解码rmvb文件：" + fileName);
    }
}
