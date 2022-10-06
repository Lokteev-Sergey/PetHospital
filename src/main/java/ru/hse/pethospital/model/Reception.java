package ru.hse.pethospital.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity(name = "reception")
@Getter
public class Reception {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Integer doctor;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Integer pet;

    @Column(name = "datetime")
    private LocalDate datetime;

    @Column(name = "description")
    private String description;

    @Column(name = "heal")
    private String heal;


}
