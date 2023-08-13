package com.tony.design.patterns.study.creational.prototype;

import java.io.*;

public class Clazz implements Cloneable, Serializable{
    private String name;
    private Student student;

    public Clazz() {
    }

    public Clazz(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
