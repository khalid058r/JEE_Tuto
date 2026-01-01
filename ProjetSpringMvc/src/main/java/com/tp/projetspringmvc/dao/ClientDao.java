package com.tp.projetspringmvc.dao;

import com.tp.projetspringmvc.entities.*;

import java.util.List;

public interface ClientDao {
    void addClient(Client c);
    void deleteClient(long code);
    Client getClientbyCode(long code);
    List<Client> getAllClients();

}
