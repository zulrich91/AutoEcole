package com.example.autoecole.controllers;


import com.example.autoecole.models.SeanceCode;
import com.example.autoecole.services.SeanceCodeService;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("seances")
public class SeanceCodeController {
    private SeanceCodeService seanceCodeService;

    public SeanceCodeController(SeanceCodeService seanceCodeService) {
        this.seanceCodeService = seanceCodeService;
    }

    @GetMapping
    public List<SeanceCode> findAll(){
        return this.seanceCodeService.findAll();
    }

    @GetMapping("{id}")
    public SeanceCode findById(@PathVariable Integer id){
        return this.seanceCodeService.findById(id);
    }

    @PostMapping
    public SeanceCode save(@RequestBody SeanceCode seanceCode){
        return this.seanceCodeService.save(seanceCode);
    }

    @PatchMapping("{id}")
    public SeanceCode update(@PathVariable Integer id, @RequestParam LocalDate date, @RequestParam Time heure){
        return this.seanceCodeService.update(id,date,heure);
    }

}
