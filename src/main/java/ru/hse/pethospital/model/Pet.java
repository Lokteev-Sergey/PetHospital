package ru.hse.pethospital.model;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity(name = "pet")
@Getter
public class Pet {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nickname")
    private String nickname;

    @ManyToOne
    @JoinColumn(name = "master_id")
    private Integer master;

    @ManyToOne
    @JoinColumn(name = "breed_id")
    private Integer breed;

    @Column(name = "birth_date")
    private LocalDate birth_date;

    @Column(name = "colour")
    private String colour;

    @Column(name = "chip")
    private String chip;

    @Column(name = "sex")
    private String sex;

    @Column(name = "sterilization")
    private String sterilization;
}