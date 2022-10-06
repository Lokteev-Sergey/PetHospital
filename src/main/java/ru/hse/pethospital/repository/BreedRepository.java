package ru.hse.pethospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hse.pethospital.model.Breed;

public interface BreedRepository extends JpaRepository<Breed, Integer> {
}