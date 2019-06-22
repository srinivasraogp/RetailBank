package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.entity.Admin;
import com.hcl.entity.Registration;
import com.hcl.repository.AdminRepository;
import com.hcl.repository.RegistrationRepository;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminRepository adminRepository;
	@Autowired
	RegistrationRepository registrationRepository;
	@Override
	public String login(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	/*s*/
}
