package com.tp.tp_ejb.session;

import com.tp.tp_ejb.entities.CompteSociete;
import jakarta.ejb.Stateless;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.List;
@Stateless
public class ImpCompteSociete implements ILocal_CompteSociete{

    @PersistenceContext(unitName = "ProjetCommandes")
    EntityManager em;

    @Override
    public void addCompte(CompteSociete compte) {
        em.persist(compte);
    }

    @Override
    public void updateCompte(CompteSociete compteSociete) {
        em.merge(compteSociete);
    }

    @Override
    public void deleteCompte(int id) {
        CompteSociete compte = em.find(CompteSociete.class, id);
        em.remove(compte);
    }

    @Override
    public CompteSociete getCompte(int id) {
        return em.find(CompteSociete.class, id);
    }

    @Override
    public List<CompteSociete> getComptes() {
        Query query = em.createQuery("select c from CompteSociete c");
        return query.getResultList();
    }
}
