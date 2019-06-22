package com.hcl.controller;

import org.apache.commons.httpclient.methods.RequestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.Registration;
import com.hcl.service.SummaryService;

@RestController
@RequestMapping("/ingretail")
public class SummaryController {
	@Autowired
	private SummaryService summaryService;
	
	@GetMapping("/summary/{userId}")
	public ResponseEntity<Registration> accountSummary(@PathVariable Long userId){
		Registration registration=summaryService.accountSummaryDetails(userId);
		return new ResponseEntity<>(registration,HttpStatus.OK);
	}

}
