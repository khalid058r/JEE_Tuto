
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Facture :</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<%
    String numFacture = request.getParameter("numFacture");
    String nom = request.getParameter("nom");
    String adresse = request.getParameter("adresse");
    String email = request.getParameter("email");

    String desc1 = request.getParameter("desc1");
    double qty1 = Double.parseDouble(request.getParameter("qte1"));
    double price1 = Double.parseDouble(request.getParameter("prix1"));
    double total1 = qty1 * price1;

    String desc2 = request.getParameter("desc2");
    double qty2 = Double.parseDouble(request.getParameter("qte2"));
    double price2 = Double.parseDouble(request.getParameter("prix2"));
    double total2 = qty1 * price1;

    String desc3 = request.getParameter("desc3");
    double qty3 = Double.parseDouble(request.getParameter("qte3"));
    double price3 = Double.parseDouble(request.getParameter("prix3"));
    double total3 = qty1 * price1;

    double remise = Double.parseDouble(request.getParameter("remise"));
    double totalHT = total1 + total2 + total3;
    double tva = totalHT * 0.20;
    double totalTTC = totalHT + tva - remise;
%>
<h2>Facture N° : <%= numFacture %></h2>

<p>Nom Client : <%= nom %></p>
<p>Adresse : <%= adresse %></p>
<p>Email : <%= email %></p>

<table border="1">
    <tr>
        <th>Description</th>
        <th>Quantité</th>
        <th>Prix Unitaire</th>
        <th>Total HT</th>
    </tr>
    <tr>
        <td><%= desc1 %></td>
        <td><%= qty1 %></td>
        <td><%= price1 %></td>
        <td><%= total1%>></td>
    </tr>
    <tr>
        <td><%= desc2 %></td>
        <td><%= qty2 %></td>
        <td><%= price2 %></td>
        <td><%= total2%>></td>
    </tr>
    <tr>
        <td><%= desc3 %></td>
        <td><%= qty3 %></td>
        <td><%= price3 %></td>
        <td><%= total3%>></td>
    </tr>
</table>
<table border="1">
    <tr>
        <th>Total Net HT</th>
        <td><%= totalHT %> DH</td>
    </tr>
    <tr>
        <th>TVA (20%)</th>
        <td><%= tva %> DH</td>
    </tr>
    <tr>
        <th>Remise</th>
        <td><%= remise %> DH</td>
    </tr>
    <tr>
        <th>Total TTC</th>
        <td><b><%= totalTTC %> DH</b></td>
    </tr>
</table>
</body>
</html>
