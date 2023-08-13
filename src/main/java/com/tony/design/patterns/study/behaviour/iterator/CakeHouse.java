package com.tony.design.patterns.study.behaviour.iterator;

import java.util.ArrayList;
import java.util.List;

public class CakeHouse {
    private List<String> menus;

    public CakeHouse() {
        menus = new ArrayList<>();
        menus.add("KFC Cake Breakfast");
        menus.add("MDL Cake Breakfast");
        menus.add("Stawberry Cake");
    }

    public Iterator iterator() {
        return new CakeHouseIterator();
    }

    class CakeHouseIterator implements Iterator {

        private int position = 0;
        @Override
        public boolean hasNext() {
           return position < menus.size();
        }

        @Override
        public Object next() {
            String menu = menus.get(position);
            position ++;
            return menu;
        }
    }
}
