package hu.borostomi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan("hu.borostomi")
@PropertySource({"classpath:application.properties"})
public class SpringCvApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCvApplication.class, args);
	}
}
