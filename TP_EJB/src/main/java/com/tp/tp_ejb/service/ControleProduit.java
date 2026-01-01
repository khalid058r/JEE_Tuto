package com.tp.tp_ejb.service;


import com.tp.tp_ejb.entities.Produit;
import com.tp.tp_ejb.session.ILocal_Produit;
import jakarta.ejb.EJB;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(serviceName = "ProduitService")
public class ControleProduit {

    @EJB
    private ILocal_Produit service;

    @WebMethod(operationName = "EnregistrerProduit")
    public String EnregistrerProduit(@WebParam(name = "prix") float prix, @WebParam(name = "marque") String marque ){

        Produit produit = new Produit();
        produit.setMarque(marque);
        produit.setPrix(prix);

        service.addProduit(produit);
        return ("Produit created");
    }

    @WebMethod(operationName = "SupprimerProduit")
    public String SupprimerProduit(@WebParam(name = "id") int id) {
        service.deleteProduit(id);
        return ("Produit deleted");
    }
}
