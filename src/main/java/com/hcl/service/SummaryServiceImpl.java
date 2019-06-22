package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.entity.Registration;
import com.hcl.repository.RegistrationRepository;

@Service
public class SummaryServiceImpl implements SummaryService{

	@Autowired
	RegistrationRepository registrationRepository;
	
	@Override
	public Registration accountSummaryDetails(Long userId) {
		
		return null;
	}

}
