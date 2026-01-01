package com.tp.tp_ejb.session;

import com.tp.tp_ejb.entities.Client;
import jakarta.ejb.*;

import java.util.List;

@Local
public interface ILocal_Client {
    void addClient(Client client);
    void updateClient(Client client);
    void deleteClient(int id);
    Client getclient(int id);
    List<Client> getAllClients();

}
