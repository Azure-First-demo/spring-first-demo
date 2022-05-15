package demo.spring.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class SpringFirstDemoApplicationTests {
	@Value("${server.port}")
	String port;

	@Autowired
	SpringFirstDemoApplication springFirstDemoApplication;

	@Autowired
	RestTemplate restTemplate;



	@Test
	void contextLoads() {
		Assertions.assertEquals("Hello world",springFirstDemoApplication.defaultPage());
	}

}
