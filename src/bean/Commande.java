package bean;

import java.io.Serializable;

public class Commande implements Serializable{
	
private	String date;
private	int montant;
private String modepaiement;
private	String statutPaiement ;
private	String modeLivraison;
private	String statutLivraison ;



public Commande(String date, int montant, String modepaiement, String statutPaiement, String modeLivraison,
		String statutLivraison) {
	super();
	this.date = date;
	this.montant = montant;
	this.modepaiement = modepaiement;
	this.statutPaiement = statutPaiement;
	this.modeLivraison = modeLivraison;
	this.statutLivraison = statutLivraison;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getMontant() {
	return montant;
}
public void setMontant(int montant) {
	this.montant = montant;
}
public String getModepaiement() {
	return modepaiement;
}
public void setModepaiement(String modepaiement) {
	this.modepaiement = modepaiement;
}
public String getStatutPaiement() {
	return statutPaiement;
}
public void setStatutPaiement(String statutPaiement) {
	this.statutPaiement = statutPaiement;
}
public String getModeLivraison() {
	return modeLivraison;
}
public void setModeLivraison(String modeLivraison) {
	this.modeLivraison = modeLivraison;
}
public String getStatutLivraison() {
	return statutLivraison;
}
public void setStatutLivraison(String statutLivraison) {
	this.statutLivraison = statutLivraison;
}
	
	
	
	
	
}
