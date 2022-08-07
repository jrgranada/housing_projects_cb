package com.practice.oauth2openidproject.repository;

import com.practice.oauth2openidproject.model.Town;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TownRepository extends JpaRepository<Town, Integer> {
}
