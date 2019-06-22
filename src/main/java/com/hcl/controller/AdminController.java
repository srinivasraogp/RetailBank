package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.Admin;
import com.hcl.service.AdminService;

@RestController
@RequestMapping("/ingretail")
public class AdminController {
	@Autowired
	private AdminService adminService;

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Admin admin) {
		String message =adminService.login(admin);
		return new ResponseEntity<>(message,HttpStatus.OK);
	}

}
