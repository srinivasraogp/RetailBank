package com.hcl.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.dto.TransactionReqDTO;
import com.hcl.dto.FundTransaferResponse;
import com.hcl.service.TransactionServiceImpl;

@RunWith(SpringRunner.class)
@WebMvcTest(value=TransactionController.class)
public class TransactionControllerTest {
	@Autowired 
	MockMvc mockMvc;
	
	@MockBean
	TransactionServiceImpl transactionServiceImpl;
	@Test
	public void fundTransferTest() throws Exception
	{
		FundTransaferResponse fundTransaferResponse=new FundTransaferResponse();
		TransactionReqDTO transactionReqDTO=new TransactionReqDTO();
		
		Mockito.when(transactionServiceImpl.fundTransfer(transactionReqDTO)).thenReturn(fundTransaferResponse);
		mockMvc.perform(
				MockMvcRequestBuilders.post("/ingretail/transaction")
				.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON)
				.content(mapToJson(transactionReqDTO)))
				.andExpect(MockMvcResultMatchers.status().isOk());
			
	}

protected String mapToJson(Object obj) throws JsonProcessingException {
	ObjectMapper objectMapper = new ObjectMapper();
	return objectMapper.writeValueAsString(obj);
}

}
