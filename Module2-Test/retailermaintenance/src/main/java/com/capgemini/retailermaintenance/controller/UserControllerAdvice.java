package com.capgemini.retailermaintenance.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.retailermaintenance.dto.UserResponse;
import com.capgemini.retailermaintenance.exception.CustomException;

@RestControllerAdvice
public class UserControllerAdvice {
	@ExceptionHandler(CustomException.class)
	public UserResponse handleEmployeeException(CustomException e) {
		UserResponse response = new UserResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}
}
