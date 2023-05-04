package com.example.demo.models.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SingInDTO {
	@NotEmpty(message = "Identifier Required")
	private String identifier;
	
	/*@Email(message = "Email is not valid", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
	@NotEmpty(message = "Email required")
	private String email;*/
	
	@NotEmpty(message = "Password Required")
	private String password;
	
	
}
