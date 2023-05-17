package vn.com.learningspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.mirage.repository.config.EnableMirageRepositories;

@SpringBootApplication
@EnableMirageRepositories(basePackages = "vn.com.learningspring.repository")
@ConfigurationPropertiesScan("vn.com.learningspring")
public class LearningspringApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(LearningspringApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(LearningspringApplication.class, args);
	}

}
