package com.example.jwt.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwt.models.AdminDetails;
import com.example.jwt.response.AdminDetailsResponse;
import com.example.jwt.service.AuthService;

@RestController
public class Auth {
	
	@Autowired
	AuthService authSerivce;
	
	
	@PostMapping("/createAdmin")
	public ResponseEntity<Object> createAdmin(@RequestBody AdminDetails adminDetails){
		
		AdminDetails admin = authSerivce.createAdmin(adminDetails);
		
		AdminDetailsResponse response = new AdminDetailsResponse(new Date(),"Admin Created Succesfully","200",admin);
		
		return new ResponseEntity<Object>(response,HttpStatus.OK);
		
		
	}
	

}
