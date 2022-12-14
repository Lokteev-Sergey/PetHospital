package ru.hse.pethospital.model;

import lombok.Getter;

import javax.persistence.*;

@Entity(name = "doctor")
@Getter
public class Doctor {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "patronymic")
    private String patronymic;
    @ManyToOne
    @JoinColumn(name = "specialization_id")
    private Specialization specialization;

    @Column(name = "experience")
    private String experience;

    @Column(name = "notes")
    private String notes;
}
