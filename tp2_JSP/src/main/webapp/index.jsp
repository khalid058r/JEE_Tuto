<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Random" %>>
<!DOCTYPE html>
<html>
<head>
    <title>Gestion Commandes</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-4 bg-light" >
    <%
        Random rd = new Random();
        int numRd = rd.nextInt(1999) + 1;
        String codeFacture = "F-"+numRd;
    %>
    <h2 class="text-primary text-center mb-4">Saisie de la Facture</h2>

    <form method="post" action="facture.jsp">
    <div class="card mb-4">
        <div class="card-header">informations Client et Facture</div>
            <div class="card-body">
                <div class="row mb-3">
                    <div class="col-md-6">
                        <label>Facture N°</label>
                        <input type="text" name="numFacture" value="<%= codeFacture %>" class="form-control" readonly>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4">
                    <label> Nom de client :</label>
                    <input type="text" name="nom">
                    </div>
                    <div class="col-md-4">
                    <label> adress de client :</label>
                    <input type="text" name="adresse">
                    </div>
                    <div class="col-md-4">
                    <label> Email de client :</label>
                    <input type="email" name="email">
                    </div>
                </div>
            </div>
    </div>
        <table>
            <thead>
                <tr>
                    <th>Description</th>
                    <th>Quantité</th>
                    <th>Prix Unitaire (DH)</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        <input type="text" name="desc1" value="produit1" class="form-control" readonly>
                    </td>
                    <td>
                        <input type="number" name="prix1" step="0.01" required><br><br>
                    </td>
                    <td>
                        <input type="number" name="qte1" required><br><br>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" name="desc2" value="produit 2" class="form-control" readonly>
                    </td>
                    <td>
                        <input type="number" name="prix2" step="0.01" required><br><br>
                    </td>
                    <td>
                        <input type="number" name="qte2" required><br><br>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" name="desc3" value="produit 3" class="form-control" readonly>
                    </td>
                    <td>
                        <input type="number" name="prix3" step="0.01" required><br><br>
                    </td>
                    <td>
                        <input type="number" name="qte3" required><br><br>
                    </td>
                </tr>
            </tbody>
        </table>
        <div class="row mb-3 justify-content-end">
            <div class="col-md-3">
                <label>Remise </label>
                <input type="number" name="remise" class="form-control" value="0">
            </div>
        </div>
    <button type="submit">calculer</button>

</form>

</body>
</html>