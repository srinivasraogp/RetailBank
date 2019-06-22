package com.hcl.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.hcl.entity.Admin;

public interface AdminService {
	public String login(@RequestBody Admin admin);

}
