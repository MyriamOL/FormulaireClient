<%@ page import="bean.Client"%>
<%@ page import="bean.Commande"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- ne pas melanger html et java tjrs mettre les balises  -->
	<%
		Client client = (Client) request.getAttribute("clientJSP");
	%>

	<%
		Commande commande = (Commande) request.getAttribute("commandeJSP");
	%>
	
<% if(client.getNom().equals(null) || client.getAdresseLivraison().equals(null) || client.getTel().equals(null)){%>
       <p> Erreur : Vous n'avez pas rempli tous les champs obligatoires. 
       <a href="http://localhost:8080/ProjetJee/index.html">Cliquez ici </a>
       pour acceder au formulaire de création client</p>
	<%}else { 
		%>
		<p>  Commande créée avec succès !!! </p>
		<%}                     %>

	<div class="intitule">
		<div class="ligne">
			nom
			<%
			out.print(client.getNom());
		%>
		</div>
		<div class="ligne">
			Prenom
			<%
			out.print(client.getPrenom());
		%>
		</div>
		<div class="ligne">
			AdresseLivraison<%
			out.print(client.getAdresseLivraison());
		%>
		</div>
		<div class="ligne">
			Telephone<%
			out.print(client.getTel());
		%>
		</div>
		<div class="ligne">
			Email<%
			out.print(client.getEmail());
		%>
		</div>

	</div>

	<h1>Information Commande</h1>

	<div class="intitule">
		<div class="ligne">
			date
			<%
			out.print(commande.getDate());
		%>
		</div>

		<div class="ligne">
			Montant
			<%
			out.print(commande.getMontant());
		%>
		</div>

		<div class="ligne">
			Mode de paiement
			<%
			out.print(commande.getModepaiement());
		%>
		</div>

		<div class="ligne">
			Statut du paiement<%
			out.print(commande.getStatutPaiement());
		%>
		</div>
		<div class="ligne">
			Mode de Livraison<%
			out.print(commande.getModeLivraison());
		%>
		</div>
		<div class="ligne">
			Statut de livraison<%
			out.print(commande.getStatutLivraison());
		%>
		</div>

	</div>







</body>
</html>