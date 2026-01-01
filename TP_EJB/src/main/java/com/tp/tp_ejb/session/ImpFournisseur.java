package com.tp.tp_ejb.session;

import com.tp.tp_ejb.entities.Fournisseur;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.List;
@Stateless
public class ImpFournisseur implements ILocal_Fournisseur{

    @PersistenceContext(unitName = "ProjetCommandes")
    EntityManager em;

    @Override
    public void addFounisseur(Fournisseur fournisseur) {
        em.persist(fournisseur);
    }

    @Override
    public void updateFournissuer(Fournisseur fournisseur) {
        em.merge(fournisseur);
    }

    @Override
    public void deleteFournisseur(int id) {
        Fournisseur f = em.find(Fournisseur.class, id);
        em.remove(f);
    }

    @Override
    public Fournisseur getFournisseur(int id) {
        return em.find(Fournisseur.class, id);
    }

    @Override
    public List<Fournisseur> getAllFournisseurs() {
        Query query = em.createQuery("select f from Fournisseur f");
        return query.getResultList();
    }
}
