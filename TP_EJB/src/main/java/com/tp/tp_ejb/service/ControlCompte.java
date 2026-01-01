package com.tp.tp_ejb.service;

import com.tp.tp_ejb.entities.CompteSociete;
import com.tp.tp_ejb.session.ILocal_CompteSociete;
import jakarta.ejb.EJB;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(serviceName = "CompteService")
public class ControlCompte {

    @EJB
    private ILocal_CompteSociete CompteService;

    @WebMethod(operationName = "EnregisterCompte")
    public String EnregisterCompte(@WebParam(name ="type") String  type) {
        CompteSociete compte = new CompteSociete();
        compte.setType(type);
        CompteService.addCompte(compte);
        return ("compte registered");

    }

    @WebMethod(operationName = "SupprimerCompte")
    public String SupprimerCompte(@WebParam(name ="id") int  id) {
        CompteService.deleteCompte(id);
        return ("compte deleted");
    }

}
