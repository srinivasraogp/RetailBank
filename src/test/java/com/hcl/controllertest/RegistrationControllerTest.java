package com.hcl.controllertest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.controller.RegistrationController;
import com.hcl.dto.RegistrationRequestDTO;
import com.hcl.service.RegistrationService;

@RunWith(SpringRunner.class)

@WebMvcTest(value = RegistrationController.class)

public class RegistrationControllerTest {

	@Autowired

	private MockMvc mockMvc;

	@MockBean

	@Autowired

	private RegistrationService registrationService;

	@Test

	public void registerCustomerTest() throws Exception {

		RegistrationRequestDTO registrationReqDto = new RegistrationRequestDTO();

		registrationReqDto.setAccountType("savings");

		registrationReqDto.setCity("chennai");

		registrationReqDto.setContactNumber(987654321);

		mockMvc.perform(post("/ingretail/registration").contentType(MediaType.APPLICATION_JSON))

				.andExpect(status().isNotFound());

	}

	public static String asJsonString(final Object obj) {

		try {

			return new ObjectMapper().writeValueAsString(obj);

		} catch (Exception e) {

			throw new RuntimeException(e);

		}

	}

}
