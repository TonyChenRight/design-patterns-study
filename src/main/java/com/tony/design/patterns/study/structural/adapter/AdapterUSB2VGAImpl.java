package com.tony.design.patterns.study.structural.adapter;

public class AdapterUSB2VGAImpl extends AdapterUSB2VGA{
    USB u =new USBImpl();
    @Override
    public void projection() {
        u.show();
    }
}
