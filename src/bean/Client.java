package bean;

import java.io.Serializable;

public class Client implements Serializable{
	
	
 private String nom;
 private String prenom;
 private String adresseLivraison;
 private String tel;
 private String email;
 
 
 
public Client(String nom, String prenom, String adresseLivraison, String tel, String email) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.adresseLivraison = adresseLivraison;
	this.tel = tel;
	this.email = email;
}

public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getAdresseLivraison() {
	return adresseLivraison;
}
public void setAdresseLivraison(String adresseLivraison) {
	this.adresseLivraison = adresseLivraison;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "Client [nom=" + nom + ", prenom=" + prenom + ", adresseLivraison=" + adresseLivraison + ", tel=" + tel
			+ ", email=" + email + "]";
}

 
 
 
}
