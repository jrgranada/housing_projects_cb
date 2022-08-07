package com.practice.oauth2openidproject.repository;

import com.practice.oauth2openidproject.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentsRepository extends JpaRepository<Department, Integer> {
}
