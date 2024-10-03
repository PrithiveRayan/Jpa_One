package com.jpa.Jpa_One.repository;

import com.jpa.Jpa_One.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
