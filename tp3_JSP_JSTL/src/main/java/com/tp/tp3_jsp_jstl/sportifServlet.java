package com.tp.tp3_jsp_jstl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;



@WebServlet("/sportifServlet")
public class sportifServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse rsp) throws IOException {
        String code = req.getParameter("code");
        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        int age = Integer.parseInt(req.getParameter("age"));
        String sexe = req.getParameter("sexe");
        String pays = req.getParameter("pays");
        String[] discips = req.getParameterValues("discip");
        String desps = String.join(", ", discips);

        sportif s = new sportif(0,code,nom,prenom,age,sexe,pays,desps);
        SportifModel.save(s);
        rsp.sendRedirect("index.jsp");


    }

    @Override
    protected void doGet(HttpServletRequest rq,HttpServletResponse rsp) throws IOException {
        int id = Integer.parseInt(rq.getParameter("id"));
        SportifModel.delete(id);
        rsp.sendRedirect("index.jsp");
    }
}