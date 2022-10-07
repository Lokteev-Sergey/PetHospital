package ru.hse.pethospital.model;

import lombok.Getter;

import javax.persistence.*;

@Entity(name = "specialization")
@Getter
public class Specialization {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "code")
    private String code;
}
