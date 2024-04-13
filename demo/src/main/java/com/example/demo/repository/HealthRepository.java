package com.example.demo.repository;

import com.example.demo.model.HealthModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HealthRepository extends JpaRepository<HealthModel, Long> {

    Optional<HealthModel> findByEmail(String email);

    void deleteByEmail(String email);

    @Query("SELECT h FROM HealthModel h WHERE h.user = :userName")
    List<HealthModel> findByUserName(String userName);

    // Add more custom queries here using @Query annotation
}
