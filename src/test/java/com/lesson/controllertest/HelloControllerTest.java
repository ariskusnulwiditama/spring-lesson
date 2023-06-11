package com.lesson.controllertest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testHelloGuest() throws Exception {
		mockMvc.perform(get("/hello")).andExpectAll(status().isOk(),
				content().string(Matchers.containsString("Hello Guest")));
	}

	@Test
	void testHelloName() throws Exception {
		mockMvc.perform(get("/hello").queryParam("name", "Joko")).andExpectAll(status().isOk(),
				content().string(Matchers.containsString("Hello Joko")));
	}
}
