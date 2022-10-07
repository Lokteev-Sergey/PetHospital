package ru.hse.pethospital.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.hse.pethospital.model.Breed;
import ru.hse.pethospital.model.Reception;
import ru.hse.pethospital.repository.BreedRepository;
import ru.hse.pethospital.repository.ReceptionRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PetHospitalController {
    private final ReceptionRepository receptionRepository;
    private final BreedRepository breedRepository;

    @GetMapping(value = "/reception")
    public List<Reception> getReceptions() {
        return receptionRepository.findAllByOrderByDatetimeDesc();
    }

    @PostMapping(value = "/reception")
    public Reception saveReception(@RequestBody Reception reception) {
        return receptionRepository.save(reception);
    }

    @GetMapping(value = "/breed")
    public List<Breed> getBreeds() {
        return breedRepository.findAll();
    }
}
