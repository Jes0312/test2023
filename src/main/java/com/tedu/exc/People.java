package com.tedu.exc;

public class People implements Cloneable {

    Integer age ;
    String name ;
    Address addr;

    public People() {
    }

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        People p =null;
        p = (People)super.clone();

        return p;
    }
}
