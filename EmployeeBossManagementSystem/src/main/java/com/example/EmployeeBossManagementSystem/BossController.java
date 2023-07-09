package com.example.EmployeeBossManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/boss-employee")
public class BossController {

    @Autowired
    BossService bossService;
@PostMapping("/add-employee")
    public String addEmployee(@RequestBody Employee employee){
        return bossService.addEmployee(employee);
    }
@PostMapping("/add-boss")
    public String addBoss(@RequestBody Boss boss){
        return bossService.addBoss(boss);
    }

    @GetMapping("/employee-under-a-particular-age")
    public List<Employee> employeeUnderAParticularAge(@RequestParam int age,@RequestParam float rating){
       return bossService.employeeUnderAParticularAge(age,rating);


    }

    @PutMapping("/update-boss-salary")
    public String updateEmployeeSalary(@RequestParam float x , @RequestParam float y){
    return bossService.updateEmployeeSalary(x,y);
    }

    @GetMapping("/get-count-of-employees")
    public int countOfEmployees(@RequestParam float bossRating,@RequestParam float employeeRating){
    return bossService.countOfEmployees(bossRating,employeeRating);
    }
}
