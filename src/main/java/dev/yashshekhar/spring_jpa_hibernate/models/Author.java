package dev.yashshekhar.spring_jpa_hibernate.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@NamedQuery(
        name = "Author.findByNamedQuery",
        query = "select a from Author a where a.age >= :age"
)
public class Author extends BaseEntity {

    private String first_name;

    private String last_name;

    @Column(nullable = false, unique = true)
    private String email;

    private int age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
