<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Gestion Clients</title>
</head>
<body>

<h2>Ajouter un Client</h2>
<form action="saveClient" method="post">
    <input name="code" placeholder="Code (laisser vide si nouveau)" type="number"/>

    <input name="nom" placeholder="Nom"/>
    <input name="prenom" placeholder="Prenom"/>
    <input name="age" placeholder="Age" type="number"/>
    <input name="ville" placeholder="Ville"/>
    <button type="submit">Save</button>
</form>

<hr/>

<h2>Liste des Clients</h2>
<table border="1">
    <tr>
        <th>Code</th>
        <th>Nom</th>
        <th>Prénom</th>
        <th>Ville</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${clients}" var="c">
        <tr>
            <td>${c.code}</td>
            <td>${c.nom}</td>
            <td>${c.prenom}</td>
            <td>${c.ville}</td>
            <td><a href="deleteClient?code=${c.code}">Delete</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>