package com.greenfox.salankiv.restcontroller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestcontrollerApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class RestcontrollerApplicationTests {

	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(),
			Charset.forName("utf8"));

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@Before
	public void setup() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testDoubling() throws Exception {
		mockMvc.perform(get("/doubling/?input=5")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.received", is(5)))
				.andExpect(jsonPath("$.result", is(10)));
	}

	@Test
	public void testDoublingWithoutInput() throws Exception {
		mockMvc.perform(get("/doubling/")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.error", is("Please provide an input!")));
	}

	@Test
	public void testGreeter() throws Exception {
		mockMvc.perform(get("/greeter/?name=Viktor&title=student")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.welcome_message", is("Oh, hi there Viktor, my dear student!")));
	}

	@Test
	public void testGreeterWithoutName() throws Exception {
		mockMvc.perform(get("/greeter/?title=student")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.error", is("Please provide a name!")));
	}

	@Test
	public void testDoUntil() throws Exception {
		mockMvc.perform(post("/dountil/sum")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"until\": 5}"))
				.andExpect(jsonPath("$.result[0]", is(15)));
	}

	@Test
	public void testDoUntilWithoutRequestBody() throws Exception {
		mockMvc.perform(post("/dountil/sum")
				.contentType(MediaType.APPLICATION_JSON)
				.content(""))
				.andExpect(jsonPath("$.error", is("Please provide what to do with the numbers!")));
	}

	@Test
	public void testArrayHandler() throws Exception {
		mockMvc.perform(post("/arrays")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{ \"what\": \"double\",\n" +
						"\"numbers\": [1, 2, 5, 10]}"))
				.andExpect(jsonPath("$.result[1]", is(4)));
	}

}
