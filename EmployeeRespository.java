package com.niti.example.entity.respository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.niti.example.entity.Employee;
import com.niti.example.entity.EmployeePKId;

public interface EmployeeRespository extends JpaRepository<Employee, EmployeePKId>{

}
