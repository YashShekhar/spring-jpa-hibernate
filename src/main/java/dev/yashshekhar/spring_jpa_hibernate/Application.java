package dev.yashshekhar.spring_jpa_hibernate;

import dev.yashshekhar.spring_jpa_hibernate.models.Author;
import dev.yashshekhar.spring_jpa_hibernate.models.Video;
import dev.yashshekhar.spring_jpa_hibernate.repository.AuthorRepository;
import dev.yashshekhar.spring_jpa_hibernate.repository.VideoRepository;
import dev.yashshekhar.spring_jpa_hibernate.specification.AuthorSpecification;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository authorRepository
	) {
		return args -> {
			Specification<Author> spec = Specification
					.where(AuthorSpecification.hasAge(30))
					.and(AuthorSpecification.firstNameContains("as"));

			authorRepository.findAll(spec).forEach(System.out::println);

		};
	}

}
