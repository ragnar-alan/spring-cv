package hu.borostomi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("hu.borostomi")
public class SpringCvApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCvApplication.class, args);
	}
}
