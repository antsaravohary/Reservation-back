package fil.ipint.restserver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;


@SpringBootTest
@AutoConfigureMockMvc
public class ConcertControllerTest {
	
	private String ctrlUrl = "/concert";
	@Autowired
	private MockMvc mockMvc;
	/**
	* Mapper to serialize/deserialize Json objects. This object is provided by
	SpringBoot
	*/
	@Autowired
	private ObjectMapper objectMapper;
	@Test
	void testAll() throws Exception {
	String url = ctrlUrl + "";
	MvcResult mvcResult = mockMvc
	.perform(get(url))
	.andExpect(status().is2xxSuccessful())
	.andReturn();
	String actualResult = mvcResult.getResponse().getContentAsString();
	// Here we receive a JSon String.
	// We just check some names
	assertThat(actualResult).contains("Stromae", "Thiefaine");

}
}
