package com.tony.design.patterns.study.structural.bridge;

public class Mp4 implements Video{
    @Override
    public void decode(String fileName) {
        System.out.println("解码MP4视频文件："+ fileName);
    }
}
