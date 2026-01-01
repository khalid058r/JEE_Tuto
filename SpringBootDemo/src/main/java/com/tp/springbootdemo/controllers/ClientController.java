package com.tp.springbootdemo.controllers;


import com.tp.springbootdemo.entities.Client;
import com.tp.springbootdemo.repositories.ClientRepo;
import com.tp.springbootdemo.services.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {

    private ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("clients", service.getAll());
        return "index";
    }
    @PostMapping("/saveClient")
    public String  save(Client client) {
        service.add(client);
        return "redirect:/";
    }
    @GetMapping("/deleteClient")
    public String delete(Long clientId) {
        service.delete(clientId);
        return "redirect:/";
    }
}
