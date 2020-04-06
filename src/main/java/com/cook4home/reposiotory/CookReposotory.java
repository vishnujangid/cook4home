package com.cook4home.reposiotory;

import com.cook4home.model.Cook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CookReposotory extends JpaRepository<Cook,Integer> {
    List<Cook> findByName(String name);
    List<Cook> findByExperience(String name);
    List<Cook> findByArea(String area);
    List<Cook> findByRating(Integer rating);
}
