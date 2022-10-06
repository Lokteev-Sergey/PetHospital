package ru.hse.pethospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hse.pethospital.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}