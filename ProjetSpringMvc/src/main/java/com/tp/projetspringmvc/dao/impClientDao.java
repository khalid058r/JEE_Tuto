package com.tp.projetspringmvc.dao;

import com.tp.projetspringmvc.entities.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Queue;

public class impClientDao implements ClientDao{

    SessionFactory sessionFactory;

    public impClientDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void addClient(Client c) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(c);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void deleteClient(long code) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Client c = session.get(Client.class, code);
        session.delete(c);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public Client getClientbyCode(long code) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Client client = session.get(Client.class,code);
        session.getTransaction().commit();
        session.close();
        return client;
    }

    @Override
    public List<Client> getAllClients() {
        Session session = sessionFactory.openSession();
        Query<Client> query = session.createQuery("from Client", Client.class);
        List<Client> clients = query.list();
        session.close();
        return clients;
    }
}
