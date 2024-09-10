package validation;

import domaine.CarteDeCredit;
import domaine.MasterCard;

import java.util.Calendar;

public class ValidationMasterCard extends Generateur {
    public ValidationMasterCard(Generateur successeur) {
        super(successeur);
    }

    @Override
    public boolean valider(String numero) {
        int prefix = Integer.parseInt(numero.substring(0, 2));
        return (prefix >= 51 && prefix <= 55) && numero.length() == 16;
    }

    @Override
    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
        if (valider(numero))
            return new MasterCard(numero, dateExpiration, nom);
        return null;
    }
}
