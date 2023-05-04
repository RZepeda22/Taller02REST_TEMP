package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.models.dto.SingInDataDTO;
import com.example.demo.models.dto.SingInDTO;
import com.example.demo.models.entities.Employee;
import com.example.demo.services.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class LibraryController {

	@Autowired
	private EmployeeService employeeService;
	
	//@PostMapping(path="/signin", consumes="application/x-www-form-urlencoded")
	
	//@ResponseBody
	@PostMapping("/signin")
	public ResponseEntity<?> getUserDataByUserOrEmailAndUser(
			 SingInDTO singIn, BindingResult validations){
		System.out.println(singIn);
		if(validations.hasErrors()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		Employee employeeFound = employeeService.findOneById(singIn.getIdentifier());
		System.out.println(employeeFound);
		if(employeeFound == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		
		if(employeeFound.getPassword().equals(singIn.getPassword())) {
			System.out.println("pasa");
			//return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		//AQUI SI HAY ALGO
		SingInDataDTO response = new SingInDataDTO(employeeFound.getUsername(), employeeFound.getEmail(), employeeFound.getRol());
		return new ResponseEntity<>(response,  HttpStatus.CREATED);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
