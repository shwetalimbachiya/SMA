package com.management.student.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import com.management.student.model.Result;

public interface ResultRepository extends JpaRepository<Result, Long> {
}
