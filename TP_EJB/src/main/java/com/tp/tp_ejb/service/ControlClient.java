package com.tp.tp_ejb.service;


import com.tp.tp_ejb.entities.Client;
import com.tp.tp_ejb.session.ILocal_Client;
import jakarta.ejb.EJB;
import jakarta.jws.*;

import java.util.List;

@WebService(serviceName = "ClientService")
public class ControlClient {

    @EJB
    private ILocal_Client ClientService;

    @WebMethod(operationName = "EnregistrerClient")
    public String createClient(@WebParam(name = "nom") String nom, @WebParam(name="prenom") String prenom, @WebParam(name="ville") String ville) {
        Client client = new Client();
        client.setNom(nom);
        client.setPrenom(prenom);
        client.setVille(ville);
        ClientService.addClient(client);
        return ("client created");
    }

    @WebMethod(operationName = "SupprimerClient")
    public String deleteClient(@WebParam(name = "id") int id) {
        ClientService.deleteClient(id);
        return ("client deleted");
    }

    @WebMethod(operationName = "ListerClient")
    public List<Client> listClient() {
        return ClientService.getAllClients();
    }
}
