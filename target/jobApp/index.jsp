<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestion de Candidatures</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #f8f9fa, #e9ecef);
            color: #343a40;
        }
        .header {
            background-color: #007bff;
            color: white;
            padding: 20px 0;
            text-align: center;
        }
        .container {
            margin-top: 30px;
        }
        .card {
            transition: transform 0.3s ease-in-out;
        }
        .card:hover {
            transform: scale(1.05);
        }
        footer {
            background-color: #343a40;
            color: white;
            padding: 10px 0;
            text-align: center;
            margin-top: 30px;
        }
    </style>
</head>
<body>

    <header class="header">
        <h1>Bienvenue à la Gestion de Candidatures</h1>
        <p>Connectez les chercheurs d'emploi et les recruteurs</p>
    </header>

    <div class="container">
        <div class="row">
            <!-- Section pour les chercheurs d'emploi -->
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body text-center">
                        <h3 class="card-title">Chercheurs d'emploi</h3>
                        <p class="card-text">Explorez des opportunités et postulez facilement.</p>
                        <a href="jobseekers.jsp" class="btn btn-primary">Accéder</a>
                    </div>
                </div>
            </div>

            <!-- Section pour les recruteurs -->
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body text-center">
                        <h3 class="card-title">Recruteurs</h3>
                        <p class="card-text">Publiez des offres et trouvez les meilleurs talents.</p>
                        <a href="recruiters.jsp" class="btn btn-primary">Accéder</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <footer>
        <p>&copy; 2025 Gestion de Candidatures. Tous droits réservés.</p>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
