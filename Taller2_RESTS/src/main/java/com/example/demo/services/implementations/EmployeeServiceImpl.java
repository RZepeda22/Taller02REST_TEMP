package com.example.demo.services.implementations;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.dto.RegisterUserDataDTO;
import com.example.demo.models.dto.SingInDTO;
import com.example.demo.models.entities.Employee;
import com.example.demo.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static List<Employee> employees = new ArrayList<>();
    
	static {
			employees.add(new Employee("0001", "Roberto", "Sanchez",30,"123", true, "Administrador", "Roberto@hotmail.com"));
		    employees.add(new Employee("0002", "Adalberto", "Martínez", 30 ,"123", true, "Administrador", "Adalberto@hotmail.com"));
		    employees.add(new Employee("0003", "Pedro", "Martínez", 30 ,"123", true, "Administrador", "Pedro@hotmail.com"));
		    employees.add(new Employee("0004", "Juan", "Alvarenga",0,"123", false, "Usuario", "Juan@hotmail.com"));
		    employees.add(new Employee("0005", "Mauricio", "Ruiz",0,"123", false, "Usuario", "Mauricio@hotmail.com"));
		    employees.add(new Employee("0006", "Daniel", "Ruiz",30,"123", true, "Usuario", "Daniel@hotmail.com"));
		        
    	
    }



	@Override
	public List<Employee> findAll() {
		return employees;
	}

	@Override
	public Employee findOneById(String identifier) {
		return employees.stream()
				.filter(u -> ( u.getUsername().equals(identifier) || u.getEmail().equals(identifier) ))
				.findAny()
				.orElse(null);
		
	}

	@Override
	public void register(RegisterUserDataDTO User) {
		Employee newEmployee = new Employee(
				User.getCodeEmployee(),
				User.getFullname(),
				User.getUsername(),
				User.getEmail(),
				0,
				User.getPassword(),
				false,
				"Usuario");

		employees = Stream.concat(employees.stream(), Stream.of(newEmployee)).collect(Collectors.toList());
		
	}

	@Override
	public void changePassword(String password, String codeEmployee) {
		employees.stream().filter(e -> e.getCodeEmployee().equals(codeEmployee)).forEach(e -> e.setPassword(password));
	}

	@Override
	public void toogleActive(String codeemployee) {
		// TODO Auto-generated method stub
		
	}

}
