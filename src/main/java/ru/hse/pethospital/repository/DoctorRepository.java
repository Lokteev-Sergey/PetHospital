package ru.hse.pethospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hse.pethospital.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}