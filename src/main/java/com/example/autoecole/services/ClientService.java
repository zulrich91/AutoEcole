package com.example.autoecole.services;

import com.example.autoecole.models.Client;

import java.util.List;

public interface ClientService {
    public List<Client> findAll();
    public Client save(Client client);
    void delete(Integer id);
    public Client update(Integer id, String nom, String prenom);
    public Client findById(Integer id);
}
