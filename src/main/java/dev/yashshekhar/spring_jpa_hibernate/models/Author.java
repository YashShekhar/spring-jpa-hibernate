package dev.yashshekhar.spring_jpa_hibernate.models;

import jakarta.persistence.*;
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
public class Author extends BaseEntity {

    private String first_name;

    private String last_name;

    @Column(nullable = false, unique = true)
    private String email;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
