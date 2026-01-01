package com.tp.tuto1servlet.Servlet;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SaveContact")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws IOException {
        rs.setContentType("text/html");
        String titre = rq.getParameter("titre");
        String Fonction = rq.getParameter("fonction");
        String langue = rq.getParameter("langue");
        String prenom = rq.getParameter("prenom");
        String nom = rq.getParameter("nom");
        String email = rq.getParameter("email");
        String gsm = rq.getParameter("gsm");
        String telephone = rq.getParameter("telephone");
        String fax = rq.getParameter("fax");
        String Note = rq.getParameter("note");

        PrintWriter out = rs.getWriter();
        out.println("<h1> Donnee Recu : </h1>");
        out.println("<ul>");
            out.println("<li> titre : "+titre+"</li>");
            out.println("<li> fonction :"+Fonction+"</li>");
            out.println("<li> langue : "+langue+"</li>");
            out.println("<li> prenom :"+prenom+"</li>");
            out.println("<li> nom :"+nom+"</li>");
            out.println("<li> email :"+email+"</li>");
            out.println("<li> gsm :"+gsm+"</li>");
            out.println("<li> tel :"+telephone+"</li>");
            out.println("<li> fax :"+fax+"</li>");
            out.println("<li> note :"+Note+"</li>");
        out.println("</ul>");

    }
}