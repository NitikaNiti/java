package com.niti.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EMPLOYEE_TBL")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(EmployeePKId.class)
public class Employee {
	@Id
	private int employeeId;
	@Id
	private int deptId;
	private String name;
	private String email;
	private String phone;
	

}
