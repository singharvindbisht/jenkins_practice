package com.example.jwt.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jwt.models.AdminDetails;
import com.example.jwt.repository.AuthRepository;
import com.example.jwt.service.AuthService;


@Service
public class AuthSeriveImpl implements AuthService{
	
	@Autowired
	AuthRepository authRepository;

	@Override
	public AdminDetails createAdmin(AdminDetails adminDetails) {
		// TODO Auto-generated method stub
		return authRepository.save(adminDetails);
	}

	
	

}
