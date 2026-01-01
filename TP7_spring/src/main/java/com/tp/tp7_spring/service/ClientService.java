package com.tp.tp7_spring.service;

import com.tp.tp7_spring.entities.Client;
import java.util.List;

public interface ClientService {
    void addClient(Client c);
    void deleteClient(Long code);
    List<Client> getAllClients();
}