package dev.yashshekhar.spring_jpa_hibernate.repository;

import dev.yashshekhar.spring_jpa_hibernate.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer>, JpaSpecificationExecutor<Author> {

    List<Author> findByNamedQuery(@Param("age") int age);
}
