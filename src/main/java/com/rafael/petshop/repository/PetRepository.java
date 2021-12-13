package com.rafael.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafael.petshop.domain.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {
	
}
