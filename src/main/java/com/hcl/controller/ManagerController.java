package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.service.ManageService;
import com.hcl.dto.*;

@RestController
@RequestMapping("/ingretail")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class ManagerController {
	@Autowired
	private ManageService adminService;

	@GetMapping("/admin")
	public ResponseEntity<List<RegistrationDetailsResDTO>> getRegistrationDetails() {
		List<RegistrationDetailsResDTO> registratonListResDto = adminService.getRegistrationDetails();
		return new ResponseEntity<>(registratonListResDto, HttpStatus.OK);
	}
	
	@PutMapping("/adminapprove/{regId}")
	public ResponseEntity<String>  approveUsers(@PathVariable Long regId){
		
		String message = adminService.approveUsers(regId);
		return new ResponseEntity<>(message, HttpStatus.CREATED);
		
		
	}
}
