package ru.hse.pethospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hse.pethospital.model.Reception;

import java.util.List;

@Repository
public interface ReceptionRepository extends JpaRepository<Reception, Long> {
    List<Reception> findAllByOrderByDatetimeDesc();
}