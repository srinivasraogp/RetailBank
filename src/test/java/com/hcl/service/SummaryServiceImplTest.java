package com.hcl.service;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hcl.dto.RegistrationDTO;
import com.hcl.entity.Registration;
import com.hcl.repository.RegistrationRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SummaryServiceImplTest {
	@InjectMocks
	SummaryServiceImpl  summaryServiceImpl;
	@Mock
	RegistrationRepository  registrationRepository;
	
	@Test
	public void accountSummaryDetailsTest()
	{
		RegistrationDTO registrationDTO=new RegistrationDTO();
	
		Registration  registration=new Registration();
		registration.setUserId(1L);
		registration.setAccountType("savings");
		when(registrationRepository.findByUserId(1L)).thenReturn(registration);
		BeanUtils.copyProperties(registration, registrationDTO);
		Assert.assertEquals(registration.getUserId(), registrationDTO.getUserId());	
	}

}
