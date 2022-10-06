package ru.hse.pethospital.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hse.pethospital.model.Reception;
import ru.hse.pethospital.repository.ReceptionRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PetHospitalController {
    private final ReceptionRepository receptionRepository;

    @GetMapping(value = "/reception")
    public List<Reception> getReceptions() {
        return receptionRepository.findAll();
    }
}
