package com.tp.projetspringmvc.service;

import com.tp.projetspringmvc.entities.Client;

import java.util.List;

public interface ClientService {
    void addClient(Client c);
    void deleteClient(Long code);
    Client getClientByCode(Long code);
    List<Client> getAllClients();
}
