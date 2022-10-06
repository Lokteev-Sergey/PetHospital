package ru.hse.pethospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hse.pethospital.model.PetType;

public interface PetTypeRepository extends JpaRepository<PetType, Integer> {
}