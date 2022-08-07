package com.practice.oauth2openidproject.repository;

import com.practice.oauth2openidproject.model.HousingProject;
import com.practice.oauth2openidproject.model.Visibility;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HousingProjectRepository extends JpaRepository<HousingProject, Integer> {
    List<HousingProject> findByVisibilityEquals(Visibility visibility);
}
