package com.example.autoecole.services;

import com.example.autoecole.models.SeanceCode;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

public interface SeanceCodeService {
    public List<SeanceCode> findAll();
    public SeanceCode save(SeanceCode seanceCode);
    void delete(Integer id);
    public SeanceCode update(Integer id, LocalDate date, Time heure);
    public SeanceCode findById(Integer id);
}
