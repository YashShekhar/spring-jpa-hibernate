package dev.yashshekhar.spring_jpa_hibernate.repository;

import dev.yashshekhar.spring_jpa_hibernate.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
