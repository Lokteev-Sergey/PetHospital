package ru.hse.pethospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hse.pethospital.model.Breed;

@Repository
public interface BreedRepository extends JpaRepository<Breed, Long> {
}