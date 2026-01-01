package com.tp.tp7_spring.dao;

import com.tp.tp7_spring.entities.Client;

import java.util.List;

public interface ClientDao {
    void addClient(Client c);
    void deleteClient(Long code);
    Client getClientByCode(Long code);
    List<Client> getAllClients();
}