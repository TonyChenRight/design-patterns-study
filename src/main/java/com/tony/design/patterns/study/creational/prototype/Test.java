package com.tony.design.patterns.study.creational.prototype;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {

        Clazz clazz1=new Clazz();
        clazz1.setName("高三一班");
        Student stu1=new Student("张三", "男", 18);
        clazz1.setStudent(stu1);

//        Clazz clazz3 = (Clazz) clazz1.clone();
        Clazz clazz3 = (Clazz) clazz1.deepClone();
        Student stu3 = clazz3.getStudent();
        stu3.setName("王五");

        System.out.println("clazz1 is " + clazz1);
        System.out.println("clazz3 is " + clazz3);
        System.out.println("clazz1 == clazz3 is " + (clazz1 == clazz3));
        System.out.println("stu1 == stu3 is " + (stu1 == stu3));



    }
}
