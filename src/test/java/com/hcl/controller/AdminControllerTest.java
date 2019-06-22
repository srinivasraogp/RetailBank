/*
 * package com.hcl.controller;
 * 
 * 
 * import org.junit.Test; import org.junit.runner.RunWith; import
 * org.mockito.Mockito; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest; import
 * org.springframework.boot.test.mock.mockito.MockBean; import
 * org.springframework.http.MediaType; import
 * org.springframework.test.context.junit4.SpringRunner; import
 * org.springframework.test.web.servlet.MockMvc; import
 * org.springframework.test.web.servlet.MvcResult; import
 * org.springframework.test.web.servlet.RequestBuilder; import
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
 * 
 * import com.fasterxml.jackson.core.JsonProcessingException; import
 * com.fasterxml.jackson.databind.ObjectMapper; import com.hcl.entity.Admin;
 * import com.hcl.service.AdminService;
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @WebMvcTest(value=AdminController.class) public class AdminControllerTest {
 * 
 * 
 * 
 * @Autowired private MockMvc mockMvc;
 * 
 * @MockBean private AdminService adminService;
 * 
 * @Test public void myTickets() throws Exception { Admin admin = new Admin();
 * admin.setUserId(12345L); admin.setPassword("admin");
 * 
 * Mockito.when(adminService.login().thenReturn(admin);
 * 
 * String URI = "/ingretail/login"; RequestBuilder requestBuilder =
 * MockMvcRequestBuilders.get(URI).accept(MediaType.APPLICATION_JSON); MvcResult
 * result = mockMvc.perform(requestBuilder).andReturn(); String outputInJson =
 * result.getResponse().getContentAsString(); String inputInJson =
 * this.mapToJson(admin); org.junit.Assert.assertEquals(outputInJson,
 * inputInJson);
 * 
 * }
 * 
 * private String mapToJson(Object object) throws JsonProcessingException {
 * ObjectMapper objectMapper = new ObjectMapper(); return
 * objectMapper.writeValueAsString(object); }
 * 
 * }
 */