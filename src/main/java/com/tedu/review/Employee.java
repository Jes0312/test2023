package com.tedu.review;

public class Employee {
    String name;
    Integer salary;
    Integer day;
    Integer grade;

    //public Employee(){};


    public Employee(String name, Integer salary, Integer day, Integer grade) {
        this.name = name;
        this.salary = salary;
        this.day = day;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public  void  printSal(){
        System.out.println("工资:name"+name+"day"+day+"grade"+grade+"salary"+salary*day*grade);
    }

}
