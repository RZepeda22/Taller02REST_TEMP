package com.example.demo.models.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChangePasswordDTO {

	@NotEmpty(message = "Code Employee required")
	private String codeEmployee;
	
	@NotEmpty(message = "Password required")
	private String password;
}
