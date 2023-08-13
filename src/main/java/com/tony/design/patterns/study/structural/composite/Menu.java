package com.tony.design.patterns.study.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent{
    private List<MenuComponent> children =new ArrayList<>();
    public Menu(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        children.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        children.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(Integer i) {
        return children.get(i);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        for (MenuComponent child : children) {
            child.print();
        }
    }
}
