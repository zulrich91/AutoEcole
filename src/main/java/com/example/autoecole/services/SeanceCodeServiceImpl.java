package com.example.autoecole.services;

import com.example.autoecole.models.SeanceCode;
import com.example.autoecole.repositories.SeanceCodeRepository;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

public class SeanceCodeServiceImpl implements SeanceCodeService{

    private SeanceCodeRepository seanceCodeRepository;

    public SeanceCodeServiceImpl(SeanceCodeRepository seanceCodeRepository) {
        this.seanceCodeRepository = seanceCodeRepository;
    }

    @Override
    public List<SeanceCode> findAll() {
        return this.seanceCodeRepository.findAll();
    }

    @Override
    public SeanceCode findById(Integer id){
        return this.seanceCodeRepository.findById(id).orElse(null);
    }

    @Override
    public SeanceCode save(SeanceCode seanceCode) {
        return this.seanceCodeRepository.save(seanceCode);
    }

    @Override
    public void delete(Integer id) {
        this.seanceCodeRepository.deleteById(id);
    }

    @Override
    public SeanceCode update(Integer id, LocalDate date, Time heure) {
        SeanceCode seanceToUpdate = this.seanceCodeRepository.findById(id).orElse(null);
        if (date != null){
            seanceToUpdate.setDate(date);
        }
        if (heure != null){
            seanceToUpdate.setHeure(heure);
        }
        return this.seanceCodeRepository.save(seanceToUpdate);
    }
}
