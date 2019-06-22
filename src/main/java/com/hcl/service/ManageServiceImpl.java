package com.hcl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.hcl.dto.RegistrationDetailsResDTO;
import com.hcl.entity.Registration;
import com.hcl.exception.DataNotFoundException;
import com.hcl.repository.ManageRepository;
import com.hcl.util.RandomNumberGen;
@Service
public class ManageServiceImpl implements ManageService{

	@Autowired
	ManageRepository adminRepository;
	

	@Autowired
	public JavaMailSender emailSender;

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
		}else {
			throw new DataNotFoundException("User not found to approve");
		}
		adminRepository.save(reg);	
		try{
			sendMail(reg.getUserId(),reg.getPassword(),reg.getFirstName());
			System.out.println("Email sent successfully...");
		}catch(Exception e){
			System.out.println(e);
		}
		return "User Approved Successfully";
	}
	
	public void sendMail(Long userId,String password,String name) throws Exception{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("srao79@gmail.com");
		message.setSubject("");
		message.setText("Hi " + name + " , please use these credentionals : userID : " +userId+" password : "+password);
		emailSender.send(message);
	}

}
