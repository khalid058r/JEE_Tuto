<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.tp.tp3_jsp_jstl.sportif, com.tp.tp3_jsp_jstl.SportifModel,java.util.*" %>

<!DOCTYPE html>
<html>
<head>
    <title>Gestion des Sportifs</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<%
    Random rd = new Random();
    int randNum = rd.nextInt(9999) + 1;
    String codeAuto = "SPR-" + randNum;

    List<sportif> list = SportifModel.getAll();
    request.setAttribute("listSportif", list);
%>

<div class="container mt-5">

    <h2 class="mb-4 text-primary">Formulaire Sportif</h2>

    <form method="post" action="sportifServlet" class="card p-4 shadow-sm">

        <div class="row mb-3">
            <div class="col-md-4">
                <label class="form-label">Code</label>
                <input type="text" name="code" value="<%= codeAuto %>" readonly class="form-control">
            </div>

            <div class="col-md-4">
                <label class="form-label">Nom</label>
                <input name="nom" type="text" class="form-control">
            </div>

            <div class="col-md-4">
                <label class="form-label">Prénom</label>
                <input name="prenom" type="text" class="form-control">
            </div>
        </div>

        <div class="row mb-3">
            <div class="col-md-3">
                <label class="form-label">Age</label>
                <input name="age" type="number" class="form-control">
            </div>

            <div class="col-md-3">
                <label class="form-label">Sexe</label><br>
                <input type="radio" name="sexe" value="F"> Femme
                <input type="radio" name="sexe" value="M"> Homme
            </div>

            <div class="col-md-3">
                <label class="form-label">Pays</label>
                <select name="pays" class="form-select">
                    <option>Belgique</option>
                    <option>France</option>
                    <option>Maroc</option>
                </select>
            </div>
        </div>

        <div class="mb-3">
            <label class="form-label">Disciplines</label><br>
            <input type="checkbox" name="discip" value="Marathon"> Marathon
            <input type="checkbox" name="discip" value="Natation"> Natation
            <input type="checkbox" name="discip" value="Sprint"> Sprint
        </div>

        <button type="submit" class="btn btn-primary">Enregistrer</button>

    </form>

    <hr class="my-5">

    <h3 class="mb-3">Liste des Sportifs</h3>

    <table class="table table-bordered table-striped table-hover shadow-sm">
        <thead class="table-dark">
        <tr>
            <th>Code</th>
            <th>Nom</th>
            <th>Prénom</th>
            <th>Age</th>
            <th>Sexe</th>
            <th>Pays</th>
            <th>Disciplines</th>
            <th>Action</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${listSportif}" var="s">
            <tr>
                <td>${s.code}</td>
                <td>${s.nom}</td>
                <td>${s.prenom}</td>
                <td>${s.age}</td>
                <td>${s.sexe}</td>
                <td>${s.pays}</td>
                <td>${s.discipline}</td>
                <td>
                    <a href="sportifServlet?id=${s.id}">Supprimer</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

</body>
</html>
