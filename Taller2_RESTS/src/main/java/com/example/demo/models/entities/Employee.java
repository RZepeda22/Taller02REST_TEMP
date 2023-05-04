package com.example.demo.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

	
	private String codeEmployee;
	private String fullName;
	private String username;
	private int dealDate;
	private String password;
	private boolean state;
	private String rol;
	private String email;

	
	
}