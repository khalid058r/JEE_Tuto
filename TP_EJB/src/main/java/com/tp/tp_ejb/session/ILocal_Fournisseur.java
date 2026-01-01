package com.tp.tp_ejb.session;

import com.tp.tp_ejb.entities.Client;
import com.tp.tp_ejb.entities.Fournisseur;
import jakarta.ejb.Local;

import java.util.List;
@Local
public interface ILocal_Fournisseur {

    void addFounisseur(Fournisseur fournisseur);
    void updateFournissuer(Fournisseur fournisseur);
    void deleteFournisseur(int id);
    Fournisseur getFournisseur(int id);
    List<Fournisseur> getAllFournisseurs();
}
