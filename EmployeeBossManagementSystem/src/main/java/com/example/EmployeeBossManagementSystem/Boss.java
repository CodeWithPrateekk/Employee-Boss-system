package com.example.EmployeeBossManagementSystem;

import java.util.List;
public class Boss {

    private String bossId;
    private String bossName;
    private int bossAge;
    private float bossSalary;
    private float bossRating;
    private List<Employee> listOfEmployees;

    public Boss() {
    }

    public Boss(String bossId, String bossName, int bossAge, float bossSalary, float bossRating, List<Employee> listOfEmployees) {
        this.bossId = bossId;
        this.bossName = bossName;
        this.bossAge = bossAge;
        this.bossSalary = bossSalary;
        this.bossRating = bossRating;
        this.listOfEmployees = listOfEmployees;
    }

    public String getBossId() {
        return bossId;
    }

    public void setBossId(String bossId) {
        this.bossId = bossId;
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public int getBossAge() {
        return bossAge;
    }

    public void setBossAge(int bossAge) {
        this.bossAge = bossAge;
    }

    public float getBossSalary() {
        return bossSalary;
    }

    public void setBossSalary(float bossSalary) {
        this.bossSalary = bossSalary;
    }

    public float getBossRating() {
        return bossRating;
    }

    public void setBossRating(float bossRating) {
        this.bossRating = bossRating;
    }

    public List<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(List<Employee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }
}
