package com.example.EmployeeBossManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BossService {

    @Autowired
    BossRepository bossRepository;
    public String addEmployee(Employee employee) {

        return bossRepository.addEmployee(employee);
    }

    public String addBoss(Boss boss) {
        return bossRepository.addBoss(boss);
    }

    public List<Employee> employeeUnderAParticularAge(int age, float rating) {

        return bossRepository.employeeUnderAParticularAge(age,rating);
    }

    public String updateEmployeeSalary(float x, float y) {
        return bossRepository.updateEmployeeSalary(x,y);
    }

    public int countOfEmployees(float bossRating, float employeeRating) {

        return bossRepository.countOfEmployees(bossRating,employeeRating);
    }
}
