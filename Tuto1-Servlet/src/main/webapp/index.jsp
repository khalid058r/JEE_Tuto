<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Contact Principal</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-5"> <h2 class="mb-4">Editer un contact</h2>

<form action="SaveContact" method="post">

    <div class="row mb-3">
        <div class="col-md-4">
            <label class="form-label"> Titre </label>
            <input type="text" name="titre" class="form-control">
        </div>
        <div class="col-md-4">
            <label class="form-label"> Fonction </label>
            <input type="text" name="fonction" class="form-control">
        </div>
        <div class="col-md-4">
            <label class="form-label">Langue</label>
            <select name="langue" class="form-select">
                <option value="francais">francais</option>
                <option value="anglais">anglais</option>
                <option value="berber">berber</option>
            </select>
        </div>
    </div>

    <div class="row mb-3">
        <div class="col-md-4">
            <label class="form-label"> Nom </label>
            <input type="text" name="nom" class="form-control">
        </div>
        <div class="col-md-4">
            <label class="form-label"> Prenom </label>
            <input type="text" name="prenom" class="form-control">
        </div>
        <div class="col-md-4">
            <label class="form-label">Email</label>
            <input type="email" name="email" class="form-control">
        </div>
    </div>

    <div class="row mb-3">
        <div class="col-md-4">
            <label class="form-label"> GSM </label>
            <input type="tel" name="gsm" class="form-control">
        </div>
        <div class="col-md-4">
            <label class="form-label"> Telephone </label>
            <input type="tel" name="telephone" class="form-control">
        </div>
        <div class="col-md-4">
            <label class="form-label">Fax</label>
            <input type="tel" name="fax" class="form-control">
        </div>
    </div>

    <div class="mb-3">
        <label class="form-label">Note</label>
        <input type="text" name="note" class="form-control">
    </div>

    <div class="mb-3">
        <button type="submit" class="btn btn-primary">sauvegarder</button>
        <button type="reset" class="btn btn-secondary">annuler</button>
    </div>

</form>
</body>
</html>