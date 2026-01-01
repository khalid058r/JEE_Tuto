package com.tp.tp2_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


@WebServlet("/factureTrait")
public class facture extends HttpServlet {
    protected void doPost(HttpServletRequest rq, HttpServletResponse rsp) throws IOException, ServletException {
        String nom = rq.getParameter("nom");
        String email = rq.getParameter("email");
        String adresse = rq.getParameter("adresse");
        double prix = Double.parseDouble(rq.getParameter("prix"));
        double qte = Double.parseDouble(rq.getParameter("qte"));
        double remise = Double.parseDouble(rq.getParameter("remise"));

        double totalHt = prix * qte +  remise;
        double tva = totalHt * 0.20;
        double totalTTC = totalHt - tva + remise;

        rq.setAttribute("nom", nom);
        rq.setAttribute("email", email);
        rq.setAttribute("adresse", adresse);
        rq.setAttribute("ht", totalHt);
        rq.setAttribute("tva", tva);
        rq.setAttribute("ttc", totalTTC);

        rq.getRequestDispatcher("facture.jsp").forward(rq,rsp);

    }

}