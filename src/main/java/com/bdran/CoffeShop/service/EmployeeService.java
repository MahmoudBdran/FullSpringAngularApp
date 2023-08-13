package com.bdran.CoffeShop.service;

import com.bdran.CoffeShop.entity.Employee;
import com.bdran.CoffeShop.exception.ResourceNotFoundException;
import com.bdran.CoffeShop.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo repo;

    public List<Employee> getEmployees() {
        return repo.findAll();
    }

    public Employee insertEmployee(Employee employee) {
        return repo.save(employee);
    }

    public Employee getEmployeeById(Long id){
        return repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Didn't find Employee with this id : "+id));
    }
    public Employee updateEmployee(Long id ,Employee employee){
        Employee updateEmp = repo.findById(id).get();
        updateEmp.setFirstName(employee.getFirstName());
        updateEmp.setLastName(employee.getLastName());
        updateEmp.setEmailId(employee.getEmailId());
        return repo.save(updateEmp);

    }

    public String deleteEmployeeById (Long id){
        Employee emp = repo.findById(id).get();
        repo.delete(emp);
        return "Deleted Successfully";
    }


}
