package com.bdran.CoffeShop.controller;

import com.bdran.CoffeShop.entity.Employee;
import com.bdran.CoffeShop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    @GetMapping("/employees")
    public List<Employee> getAllEmps(){
        return service.getEmployees();
    }

    @PostMapping("/addEmployee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return service.insertEmployee(employee);
    }
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
        return ResponseEntity.ok(service.getEmployeeById(id));
    }
    @PutMapping("/updateEmployee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee employee){
        return ResponseEntity.ok(service.updateEmployee(id,employee));
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable Long id){
        return ResponseEntity.ok(service.deleteEmployeeById(id));
    }




}
