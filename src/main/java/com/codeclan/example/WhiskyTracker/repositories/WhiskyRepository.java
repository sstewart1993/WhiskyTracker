package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long> {
    List<Whisky> findWhiskiesByAge(int age);

    List<Whisky> findWhiskiesByAgeGreaterThan(int age);

    List<Whisky> findWhiskiesByYear(int year);


    List<Whisky> findWhiskiesByDistilleryAndAge(Distillery distillery, int age);


    List<Whisky> findWhiskiesByRegionFromDistilleries(List<Distillery> distilleries);

}
