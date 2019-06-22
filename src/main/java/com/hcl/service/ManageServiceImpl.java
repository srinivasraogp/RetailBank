package com.hcl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dto.RegistrationDetailsResDTO;
import com.hcl.entity.Registration;
import com.hcl.repository.ManageRepository;
import com.hcl.util.RandomNumberGen;
@Service
public class ManageServiceImpl implements ManageService{

	@Autowired
	ManageRepository adminRepository;
	@Override
	public List<RegistrationDetailsResDTO> getRegistrationDetails() {
		List<RegistrationDetailsResDTO> registrationDetailsResDTO = new ArrayList<>();
		List<Registration>  regList = adminRepository.findByUsersbyZero();
		for(Registration regrec:regList) {
			RegistrationDetailsResDTO regdto = new RegistrationDetailsResDTO();
			BeanUtils.copyProperties(regrec, regdto);
			registrationDetailsResDTO.add(regdto);
		}
		return registrationDetailsResDTO;
	}
	@Override
	public String approveUsers(Long regId) {
		Registration reg = adminRepository.findByRegId(regId);
		if(reg != null) {
		   reg.setUserId(RandomNumberGen.getUserIdNumber());
		   reg.setAccountNumber(RandomNumberGen.getAccountNumber());
		   reg.setPassword(RandomNumberGen.getPassWord(reg.getFirstName()));
		}
		adminRepository.save(reg);		
		return "User Approved Successfully";
	}

}
