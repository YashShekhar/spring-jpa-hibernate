package dev.yashshekhar.spring_jpa_hibernate;

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
			var video = Video.builder()
					.name("abc")
					.length(5)
					.build();
			videoRepository.save(video);
		};
	}

}
