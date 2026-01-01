package com.tp.tp_ejb.session;

import com.tp.tp_ejb.entities.CompteSociete;
import jakarta.ejb.Local;

import java.util.List;

@Local
public interface ILocal_CompteSociete {

    public void addCompte(CompteSociete compte);
    public void updateCompte(CompteSociete compteSociete);
    public void deleteCompte(int id);
    public CompteSociete getCompte(int id);
    public List<CompteSociete> getComptes();
}
