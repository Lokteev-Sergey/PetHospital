package ru.hse.pethospital.model;

import lombok.Getter;

import javax.persistence.*;

@Entity(name = "type")
@Getter
public class PetType {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "title")
    private String title;
}
