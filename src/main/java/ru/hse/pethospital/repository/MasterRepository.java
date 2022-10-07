package ru.hse.pethospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hse.pethospital.model.Master;

@Repository
public interface MasterRepository extends JpaRepository<Master, Long> {
}