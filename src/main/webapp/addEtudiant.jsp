<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Ajout Etudiant </title>
<link rel="stylesheet" href="style.css">
</head>
<body>



<div class="container" id="container">
	
	<div class="form-container sign-in-container">
		<form action="servlete" method="post">
			<h1 style="margin-bottom: 20px;">Ajouter Etudiant </h1>
			
			<input type="text" name="nom" placeholder="Nom" />
			<input type="text" name="ville" placeholder="Ville" />
			<input type="date" name="date_naissance" placeholder="Date Naissance" />
			<a href="#">Les Notes de l'etudiant </a>
			
			<div style="display: flex;" >
				<input  style="margin-right:2px"   name="java" type="number" max=20 placeholder="Java" />
				<input  style="margin-right:2px"   name="mongodb" type="number" max=20  placeholder="MongoDB" />
				<input  style="margin-right:2px"   name="python" type="number" max=20  placeholder="Python" />
			</div>
			<p></p>
			<button> Enregistrer </button>
		</form>
	</div>

	<div class="overlay-container">
		<div class="overlay">
			<div class="overlay-panel overlay-left">
				<h1>Welcome Back!</h1>
				<p>To keep connected with us please login with your personal info</p>
				<button class="ghost" id="signIn">Sign In</button>
			</div>
			<div class="overlay-panel overlay-right">
				<h1>Gestion des etudiants</h1>
				<p> Ajouter,Supprimer et visulaiser les etudiants avec leurs notes </p>
				<a class="cl ghost"  href="/etC"> Liste Etudiant</a>
			</div>
		</div>
	</div>
</div>




</body>
</html>