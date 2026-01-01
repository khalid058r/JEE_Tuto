package com.tp.tp_ejb.session;

import com.tp.tp_ejb.entities.Client;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.List;

@Stateless
public class ImpClient implements  ILocal_Client{

    @PersistenceContext(unitName = "ProjetCommandes")
    EntityManager em;

    @Override
    public void addClient(Client client) {
        em.persist(client);
    }

    @Override
    public void updateClient(Client client) {
        em.merge(client);

    }

    @Override
    public void deleteClient(int id) {
        Client client = em.find(Client.class, id);
        em.remove(client);
    }

    @Override
    public Client getclient(int id) {
        return em.find(Client.class, id);
    }

    @Override
    public List<Client> getAllClients() {
        Query query = em.createQuery("select c from Client c");
        return query.getResultList();
    }
}
