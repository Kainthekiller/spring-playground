package com.galvinaz.employee;

public class Employee {


    String name = "";
    int id;
    long salary;

    public Employee(String name, int id, long salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public long getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
