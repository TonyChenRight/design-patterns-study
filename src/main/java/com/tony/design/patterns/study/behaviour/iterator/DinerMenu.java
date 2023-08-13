package com.tony.design.patterns.study.behaviour.iterator;

import java.util.ArrayList;
import java.util.List;

public class DinerMenu {
    private String[] menus;

    public DinerMenu() {
        menus = new String[3];
        menus[0] = "vegetable Blt";
        menus[1] = "Blt";
        menus[2] = "bean soup";
    }

    public Iterator iterator() {
        return new DinerIterator();
    }

    class DinerIterator implements Iterator {

        private int position = 0;
        @Override
        public boolean hasNext() {
           return position < menus.length;
        }

        @Override
        public Object next() {
            String menu = menus[position];
            position ++;
            return menu;
        }
    }
}
