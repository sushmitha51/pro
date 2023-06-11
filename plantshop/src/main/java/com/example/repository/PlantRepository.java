package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.PlantModel1;

public interface PlantRepository extends JpaRepository<PlantModel1,Integer>{
	PlantModel1 findByUsername(String name);
	
	
	
}
