package com.tp.projetspringmvc.controller;

import com.tp.projetspringmvc.service.ClientService;
import com.tp.projetspringmvc.entities.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientController {

    private ClientService clientService;

    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping("/saveClient")
    public String saveClient(
            @RequestParam Long code ,
            @RequestParam String nom,
            @RequestParam String prenom,
            @RequestParam int age ,
            @RequestParam String ville,
            Model model
    ) {

        Client c = new Client();
        c.setCode(code);
        c.setNom(nom);
        c.setPrenom(prenom);
        c.setAge(age);
        c.setVille(ville);
        clientService.addClient(c);
        model.addAttribute("clients", clientService.getAllClients());
        return "index";
    }

    @RequestMapping("deleteClient")
    public String deleteClient(
            @RequestParam Long code,
            Model model

    )
    {
        clientService.deleteClient(code);
        model.addAttribute("clients", clientService.getAllClients());
        return "index";
    }

}
