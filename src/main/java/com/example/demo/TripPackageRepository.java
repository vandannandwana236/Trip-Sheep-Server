package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripPackageRepository extends JpaRepository<TripPackageModel, Long> {
	
	
	
}
