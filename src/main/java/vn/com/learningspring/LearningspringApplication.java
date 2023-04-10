package vn.com.learningspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
//@EnableJdbcRepositories(basePackages = "vn.com.learningspring.repository")
public class LearningspringApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LearningspringApplication.class, args);
	}

}
