package ru.hse.pethospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hse.pethospital.model.Master;

public interface MasterRepository extends JpaRepository<Master, Integer> {
}