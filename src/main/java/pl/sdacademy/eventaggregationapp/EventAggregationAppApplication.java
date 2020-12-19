package pl.sdacademy.eventaggregationapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class,
		UserDetailsServiceAutoConfiguration.class,
		SecurityFilterAutoConfiguration.class})
public class EventAggregationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventAggregationAppApplication.class, args);
	}
}
