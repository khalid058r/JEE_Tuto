package com.tp.tp_ejb.service;


import com.tp.tp_ejb.entities.Fournisseur;
import com.tp.tp_ejb.session.ILocal_Fournisseur;
import jakarta.ejb.EJB;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(serviceName = "FournisseurService")
public class ControlFournisseur {

    @EJB
    private ILocal_Fournisseur  service;

    @WebMethod(operationName = "EnregistreFournisseur")
    public String EnregistreFournisseur(@WebParam(name = "nom")String nom ,@WebParam String adresse) {
        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setNom(nom);
        fournisseur.setAdresse(adresse);
        service.addFounisseur(fournisseur);
        return ("Fournisseur added");

    }
    @WebMethod(operationName = "supprimerFournisseur")
    public String supprimerFournisseur(@WebParam(name = "id") int id) {
        service.deleteFournisseur(id);
        return ("Fournisseur deleted");

    }
}
