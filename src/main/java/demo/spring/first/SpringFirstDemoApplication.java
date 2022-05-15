package demo.spring.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringFirstDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFirstDemoApplication.class, args);
	}

	@GetMapping("/")
	public static String defaultPage(){
		return "Welcome to Azure.";
	}
}
