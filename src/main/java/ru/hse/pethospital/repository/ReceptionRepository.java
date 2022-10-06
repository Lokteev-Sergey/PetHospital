package ru.hse.pethospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hse.pethospital.model.Reception;

public interface ReceptionRepository extends JpaRepository<Reception, Integer> {
}