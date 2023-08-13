package com.bdran.CoffeShop;

import com.bdran.CoffeShop.entity.Employee;
import com.bdran.CoffeShop.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.ArrayList;
import java.util.List;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class CoffeShopApplication implements CommandLineRunner {
	@Autowired
	private EmployeeRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(CoffeShopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if(repo.findAll().isEmpty()){
			List<Employee> employees = new ArrayList<>();
			employees.add(new Employee(1L,"ahmed","hassan","ahmed.hassan@gmail.com"));
			employees.add(new Employee(21L,"hassan","hassanin","hassan.hassanin@gmail.com"));
			employees.add(new Employee(13L,"mahmoud","bdran","mahmoud.bdran@gmail.com"));
			repo.saveAll(employees);
		}
	}
}
