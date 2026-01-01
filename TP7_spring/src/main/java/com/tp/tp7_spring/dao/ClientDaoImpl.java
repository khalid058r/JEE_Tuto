package com.tp.tp7_spring.dao;


import com.tp.tp7_spring.entities.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ClientDaoImpl implements ClientDao {

    private SessionFactory sessionFactory;

    public ClientDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addClient(Client c) {
        Session s = sessionFactory.openSession();
        s.beginTransaction();
        s.save(c);
        s.getTransaction().commit();
        s.close();
    }

    @Override
    public void deleteClient(Long code) {
        Session s = sessionFactory.openSession();
        s.beginTransaction();
        Client c = s.get(Client.class, code);
        s.delete(c);
        s.getTransaction().commit();
        s.close();
    }

    @Override
    public Client getClientByCode(Long code) {
        Session s = sessionFactory.openSession();
        Client c = s.get(Client.class, code);
        s.close();
        return c;
    }

    @Override
    public List<Client> getAllClients() {
        Session s = sessionFactory.openSession();
        List<Client> list = s.createQuery("from Client", Client.class).list();
        s.close();
        return list;
    }
}
