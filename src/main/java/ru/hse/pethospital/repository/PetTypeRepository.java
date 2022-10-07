package ru.hse.pethospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hse.pethospital.model.PetType;

@Repository
public interface PetTypeRepository extends JpaRepository<PetType, Long> {
}