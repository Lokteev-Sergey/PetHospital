package ru.hse.pethospital.model;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "breed")
@Getter
public class Breed {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;

    @Column(name = "code")
    private String code;
}
