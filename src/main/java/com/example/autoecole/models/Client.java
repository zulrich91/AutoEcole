package com.example.autoecole.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "client", schema = "auto")
@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "date_naissance")
    private LocalDate dateNaissance;

//    @Column(name = "SEANCE_CODE_seance_Id", nullable = false)
//    private Integer sceanceId;

}
