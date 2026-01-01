package com.tp.tp7_spring.service;

import com.tp.tp7_spring.dao.ClientDao;
import com.tp.tp7_spring.entities.Client;
import java.util.List;

public class ClientServiceImpl implements ClientService {

    private ClientDao clientDao;

    public ClientServiceImpl(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public void initialiser() {}

    @Override
    public void addClient(Client c) {
        clientDao.addClient(c);
    }

    @Override
    public void deleteClient(Long code) {
        clientDao.deleteClient(code);
    }

    @Override
    public List<Client> getAllClients() {
        return clientDao.getAllClients();
    }
}
