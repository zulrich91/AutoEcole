package com.example.autoecole.models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

@Table(name = "SEANCE_CODE", schema = "auto")
@Data
@Entity
public class SeanceCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SEANCE_CODE_id", nullable = false)
    private Integer id;

    @Column(name = "date")
    private LocalDate date;

    @Transient
    @Column(name = "heure")
    private Time heure;

    @Column(name = "nombre_fautes")
    private Integer nombreFautes;

    @Column(name = "lieu")
    private String lieu;

    @Column(name = "est_examen")
    private Boolean estExamen;

    @OneToMany(mappedBy = "seanceCode")
    private List<Client> clients;

}
