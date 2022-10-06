package ru.hse.pethospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hse.pethospital.model.Specialization;


public interface SpecializationRepository extends JpaRepository<Specialization, Integer> {
}