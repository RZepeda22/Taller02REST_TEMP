package com.example.demo.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SingInDataDTO {
	private String username;
	private String email;
	private String rol;
}
