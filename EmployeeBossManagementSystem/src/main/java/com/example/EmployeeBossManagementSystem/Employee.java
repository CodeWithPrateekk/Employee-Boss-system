package com.example.EmployeeBossManagementSystem;

public class Employee {

    private String id;
    private String name;
    private int age;
    private float salary;
    private float rating;

    private Boss boss;

    public Employee() {
    }

    public Employee(String id, String name, int age, float salary, float rating, Boss boss) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.rating = rating;
        this.boss = boss;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }
}
