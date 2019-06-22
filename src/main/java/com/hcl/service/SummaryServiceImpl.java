package com.hcl.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.controller.SummaryController;
import com.hcl.dto.RegistrationDTO;
import com.hcl.entity.Registration;
import com.hcl.repository.RegistrationRepository;

@Service
public class SummaryServiceImpl implements SummaryService{

	private static final Logger LOGGER = LoggerFactory.getLogger(SummaryController.class);

	@Autowired
	RegistrationRepository registrationRepository;
	
	@Override
	public RegistrationDTO accountSummaryDetails(Long userId) {
		
		LOGGER.debug("get accountSummaryDetails by userid  :  "+userId);
		RegistrationDTO registrationDTO=new RegistrationDTO();
		Registration  registration=	registrationRepository.findById(userId).orElse(null);
		BeanUtils.copyProperties(registration, registrationDTO);
		return registrationDTO;
	}

}
