package com.example.autoecole.services;

import com.example.autoecole.models.Client;
import com.example.autoecole.repositories.ClientRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public class ClientServiceImpl implements ClientService{

    private ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> findAll() {
        return this.clientRepository.findAll();
    }

    @Override
    public Client save(Client client) {
        return this.clientRepository.save(client);
    }

    @Override
    public void delete(Integer id) {
        this.clientRepository.deleteById(id);
    }

    @Override
    public Client update(Integer id, String nom, String prenom){
        Client clientToUpdate = this.clientRepository.findById(id).orElse(null);
        if (nom != null){
            clientToUpdate.setNom(nom);
        }
        if (prenom != null){
            clientToUpdate.setPrenom(prenom);
        }
        return this.clientRepository.save(clientToUpdate);
    }

    @Override
    public Client findById(Integer id){
        return this.clientRepository.findById(id).orElse(null);
    }
}
