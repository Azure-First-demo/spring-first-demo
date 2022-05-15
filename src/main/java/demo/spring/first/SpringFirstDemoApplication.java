package demo.spring.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class SpringFirstDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFirstDemoApplication.class, args);
	}

	@GetMapping("/")
	public static String defaultPage(){
		return "Hello world";
	}

	@Bean
	public RestTemplate getRestController(){
		return new RestTemplate();
	}

}
