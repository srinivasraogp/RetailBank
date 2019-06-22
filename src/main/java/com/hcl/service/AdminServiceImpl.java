package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.entity.Admin;
import com.hcl.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{
@Autowired
AdminRepository adminRepository;
	
	@Override
	public String login(Admin admin) {
		
		Admin admin2=adminRepository.findById(admin.getUserId()).orElse(null);
		if(admin2!=null)
		{
		if((admin2.getUserId().equals(admin.getUserId()))&&(admin2.getPassword().equals(admin.getPassword())))
		{
			return "admin successfully   "+admin2.getUserId();
		}
		else
		{
		  return "registrations check";
		}
		}
		return "login failed";
		
	}

}
