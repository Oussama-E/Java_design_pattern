package validation;

import domaine.CarteDeCredit;
import domaine.Visa;

import java.util.Calendar;

public class ValidationVisa extends Generateur {
    public ValidationVisa(Generateur successeur) {
        super(successeur);
    }

    @Override
    public boolean valider(String numero) {
        return numero.startsWith("4");
    }

    @Override
    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
        if (valider(numero))
            return new Visa(numero, dateExpiration, nom);
        return null;
    }
}
