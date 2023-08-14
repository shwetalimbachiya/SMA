package com.management.student.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import com.management.student.model.Course;


public interface CourseRepository extends JpaRepository<Course, Long> {
}
