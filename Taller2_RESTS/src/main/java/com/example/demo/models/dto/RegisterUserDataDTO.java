package com.example.demo.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterUserDataDTO {


	private String username;
	private String email;
	private int dealDate;
	private String rol;
}
