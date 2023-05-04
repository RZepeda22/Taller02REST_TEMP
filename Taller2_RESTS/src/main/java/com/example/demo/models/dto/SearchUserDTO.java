package com.example.demo.models.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SearchUserDTO {
	
	@NotEmpty(message = "Code Employee required")
	private String codeEmployee;
}
