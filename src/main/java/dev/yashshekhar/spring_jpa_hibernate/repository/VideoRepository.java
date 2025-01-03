package dev.yashshekhar.spring_jpa_hibernate.repository;

import dev.yashshekhar.spring_jpa_hibernate.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
