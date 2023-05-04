package com.example.demo.services;

import java.util.List;

import com.example.demo.models.dto.RegisterUserDataDTO;
import com.example.demo.models.dto.SingInDTO;
import com.example.demo.models.entities.Employee;

public interface EmployeeService {
	List<Employee> findAll();
	Employee findOneById(String identifier);
	void register(RegisterUserDataDTO User);
	void changePassword(String password, String codeEmployee);
	void toogleActive(String codeemployee);

}
