package com.management.student.interfaces;
import org.springframework.data.jpa.repository.JpaRepository;

import com.management.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
