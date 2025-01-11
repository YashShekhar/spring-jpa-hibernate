package dev.yashshekhar.spring_jpa_hibernate;

import dev.yashshekhar.spring_jpa_hibernate.models.Author;
import dev.yashshekhar.spring_jpa_hibernate.models.Video;
import dev.yashshekhar.spring_jpa_hibernate.repository.AuthorRepository;
import dev.yashshekhar.spring_jpa_hibernate.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	//@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository authorRepository,
			VideoRepository videoRepository
	) {
		return args -> {
			var author = Author.builder()
					.first_name("Yash")
					.last_name("Shekhar")
					.email("yash.shekhar@email.com")
					.age(50)
					.build();
			authorRepository.save(author);
			// Calling named query
			authorRepository.findByNamedQuery(45).forEach(System.out::println);

		};
	}

}
