package com.tp.tp_ejb.session;

import com.tp.tp_ejb.entities.Produit;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.List;

@Stateless
public class ImProduit implements ILocal_Produit{

    @PersistenceContext(unitName = "ProjetCommandes")
    private EntityManager em;

    @Override
    public void addProduit(Produit produit) {
        em.persist(produit);
    }

    @Override
    public void updateProduit(Produit produit) {
        em.merge(produit);
    }

    @Override
    public List<Produit> getProduits() {
        Query query = em.createQuery("SELECT p FROM Produit p");
        return query.getResultList();
    }

    @Override
    public Produit getProduit(int id) {
        Produit produit = em.find(Produit.class, id);
        return  produit;
    }

    @Override
    public void deleteProduit(int id) {
        Produit produit = em.find(Produit.class, id);
        em.remove(produit);
    }
}
