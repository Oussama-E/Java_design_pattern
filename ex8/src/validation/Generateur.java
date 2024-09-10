package validation;

import java.util.Calendar;

import domaine.CarteDeCredit;

public abstract class Generateur {
	private Generateur successeur;

	public Generateur(Generateur successeur) {
		this.successeur = successeur;
	}

	public CarteDeCredit traiterRequete(String numero, Calendar dateExpiration, String nom){
		if (successeur == null) {
			System.out.println("Invalide");
			return null;
		}
		if (valider(numero)){
			CarteDeCredit carteDeCredit = creerCarte(numero, dateExpiration, nom);
			System.out.println("carte crée!");
			return carteDeCredit;
		}
		else
			return successeur.traiterRequete(numero, dateExpiration, nom);
	}

	public abstract boolean valider(String numero);
	public abstract CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom);
}
