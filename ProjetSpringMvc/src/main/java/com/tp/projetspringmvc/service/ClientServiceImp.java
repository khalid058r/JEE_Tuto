package com.tp.projetspringmvc.service;

import com.tp.projetspringmvc.dao.ClientDao;
import com.tp.projetspringmvc.entities.Client;

import java.util.List;

public class ClientServiceImp implements ClientService {

    private ClientDao clientDao;

    public ClientServiceImp(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public void Initialiser() {}

    @Override
    public void addClient(Client c) {
        clientDao.addClient(c);
    }

    @Override
    public void deleteClient(Long code) {
        clientDao.deleteClient(code);
    }

    @Override
    public Client getClientByCode(Long code) {
        return clientDao.getClientbyCode(code);
    }

    @Override
    public List<Client> getAllClients() {
        return clientDao.getAllClients();
    }
}
