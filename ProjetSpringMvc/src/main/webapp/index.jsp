<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="saveClient" method="post">
    <label> code :</label>
    <input name="code" type="text">
    <label> Nom :</label>
    <input name="nom" type="text">
    <label> Prenom :</label>
    <input name="prenom" type="text">
    <label> Age :</label>
    <input name="age" type="number">
    <label> Ville :</label>
    <input name="ville" type="text">

    <button type="submit">Save</button>
</form>

<c:forEach items="${clients}" var="c">
   ${c.code} ${c.nom} ${c.prenom}
    <a href="deleteClient?code=${c.code}">Supprimer</a>
    <br>
</c:forEach>

</body>
</html>