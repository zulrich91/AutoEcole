package com.example.autoecole.controllers;

import com.example.autoecole.models.Client;
import com.example.autoecole.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients")
@CrossOrigin
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> findAll(){
        return this.clientService.findAll();
    }

    @GetMapping("{id}")
    public Client findById(@PathVariable Integer id){
        return this.clientService.findById(id);
    }

    @PostMapping
    public Client save(@RequestBody Client client){
        return this.clientService.save(client);
    }

    @DeleteMapping("{id}")
    public Integer delete(@PathVariable Integer id){
        this.clientService.delete(id);
        return id;
    }

    @PatchMapping("{id}")
    public Client update(@PathVariable Integer id, @RequestParam String nom, @RequestParam(required = false) String prenom ){
        return this.clientService.update(id,nom,prenom);
    }
}
