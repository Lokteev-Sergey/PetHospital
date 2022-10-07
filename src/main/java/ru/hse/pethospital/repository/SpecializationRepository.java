package ru.hse.pethospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hse.pethospital.model.Specialization;

@Repository

public interface SpecializationRepository extends JpaRepository<Specialization, Long> {
}