package ru.hse.pethospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hse.pethospital.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer> {
}