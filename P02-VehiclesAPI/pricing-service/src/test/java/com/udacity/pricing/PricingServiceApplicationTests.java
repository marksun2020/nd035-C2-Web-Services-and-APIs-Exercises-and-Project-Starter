package com.udacity.pricing;

import com.udacity.pricing.api.PricingController;
import com.udacity.pricing.service.PricingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import java.util.Random;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(value = PricingController.class)
public class PricingServiceApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	PricingService service;

	@Test
	public void contextLoads() {
	}

	@Test
	public void getPrice() throws Exception {
		Random random = new Random();
		int vehicleId = random.nextInt(19) + 1;
		mockMvc.perform(MockMvcRequestBuilders.get(String.format("/services/price?vehicleId=%d", vehicleId))).andExpect(status().isOk()).andExpect(content().contentType(MediaType.APPLICATION_JSON));
	}

}
