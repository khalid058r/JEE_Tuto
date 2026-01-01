package com.tp.tp_ejb.session;

import com.tp.tp_ejb.entities.Produit;
import jakarta.ejb.Local;

import java.util.List;

@Local
public interface ILocal_Produit {

    public void addProduit(Produit produit);
    public void updateProduit(Produit produit);
    public List<Produit> getProduits();
    public Produit getProduit(int id);
    public void deleteProduit(int id);
}
