package com.tp.springbootdemo.services;

import com.tp.springbootdemo.entities.Client;
import com.tp.springbootdemo.repositories.ClientRepo;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepo clientRepo;

    public ClientService(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }
    public void add(Client client) {
        clientRepo.save(client);
    }
    public void delete(Long id) {
        clientRepo.deleteById(id);
    }

    public List<Client> getAll() {
        return clientRepo.findAll();
    }


}
