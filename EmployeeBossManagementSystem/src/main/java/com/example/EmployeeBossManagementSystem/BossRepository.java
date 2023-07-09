package com.example.EmployeeBossManagementSystem;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class BossRepository {

    HashMap<String,Employee> employeeDb = new HashMap<>();
    HashMap<String,Boss> bossDb = new HashMap<>();

    public String addEmployee(Employee employee) {
        if(employeeDb.containsKey(employee.getId()))
            return "Employee already exists";

        employeeDb.put(employee.getId(),employee);

        return "New employee added successfully";

    }

    public String addBoss(Boss boss) {

        if(bossDb.containsKey(boss.getBossId()))
            return "Boss already exists";

        bossDb.put(boss.getBossId(),boss);

        return "New Boss added successfully";

    }


    public List<Employee> employeeUnderAParticularAge(int age, float rating) {
        List<Employee> employees = new ArrayList<>();

        for(String ids : employeeDb.keySet()){
            if(employeeDb.get(ids).getAge() < age && employeeDb.get(ids).getRating() > rating)
            {
                employees.add(employeeDb.get(ids));
            }
    }

        return employees;
}


    public String updateEmployeeSalary(float x, float y) {

        for(String ids : bossDb.keySet()){
            if(bossDb.get(ids).getBossRating() > y){
               Boss boss = bossDb.get(ids);
               boss.setBossSalary(boss.getBossSalary() + x);
               bossDb.put(ids,boss);
            }
        }

        return "Boss's salary has been updated";
    }


    public int countOfEmployees(float bossRating, float employeeRating) {
        int count = 0;

        for(String ids : employeeDb.keySet()){
            if(employeeDb.get(ids).getRating() > employeeRating && employeeDb.get(ids).getBoss().getBossRating() > bossRating){
                count ++;
            }
        }

        return count;
    }
}
