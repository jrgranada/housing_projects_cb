package com.practice.oauth2openidproject.repository;

import com.practice.oauth2openidproject.model.Visibility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisibilityRepository extends JpaRepository<Visibility, Integer> {
}
