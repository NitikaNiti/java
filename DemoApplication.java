package com.niti.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niti.example.entity.Employee;
import com.niti.example.entity.respository.EmployeeRespository;

@SpringBootApplication
@RestController
@RequestMapping("/employee")
public class DemoApplication {
	
	@Autowired
	EmployeeRespository employeeRespository;

	@PostMapping
	public Employee save(@RequestBody Employee employee) {
		return employeeRespository.save(employee);
		
	}
	
	@GetMapping
	public List<Employee> getAll(){
		return employeeRespository.findAll();
	}
	

	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
	}

}
