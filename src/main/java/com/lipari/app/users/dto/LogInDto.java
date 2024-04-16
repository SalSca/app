package com.lipari.app.users.dto;

import org.springframework.stereotype.Component;

@Component
public class LogInDto {

	private String username,password;
	
	public LogInDto() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
