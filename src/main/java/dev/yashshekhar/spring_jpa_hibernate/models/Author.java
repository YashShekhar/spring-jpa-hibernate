package dev.yashshekhar.spring_jpa_hibernate.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Author {

    @Id
    @GeneratedValue
    private Integer id;

    private String first_name;

    private String last_name;

    @Column(nullable = false, unique = true)
    private String email;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
