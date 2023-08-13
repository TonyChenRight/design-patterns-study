package com.tony.design.patterns.study.structural.composite;

public abstract class MenuComponent {
    String name;
    Integer level;
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("不支持添加操作!");
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("不支持删除操作!");
    }
    public MenuComponent getChild(Integer i) {
        throw new UnsupportedOperationException("不支持获取子菜单操作!");
    }
    public String getName() {
        throw new UnsupportedOperationException("不支持获取名字操作!");
    }
    public void print() {
        throw new UnsupportedOperationException("不支持打印操作!");
    }
}
