package com.tony.design.patterns.study.behaviour.iterator;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Iterator> iterators =new ArrayList<>();
        iterators.add(new CakeHouse().iterator());
        iterators.add(new DinerMenu().iterator());

        for (Iterator iterator : iterators) {
            System.out.println("============");
            while (iterator.hasNext()) {
                String menu = (String)iterator.next();
                System.out.println(menu);

            }
        }
    }
}
