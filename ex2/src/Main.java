import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage : java ListerMots fichier");
            System.exit(1);
        }

        ImprimerStrategy motEnP = new CommencePar('p');
        ImprimerStrategy motLongueur8 = new Longueur(8);
        ImprimerStrategy motPalindrome = new Palindromes();
        ImprimerStrategy motLong8EnP = new And(motEnP, motLongueur8);
        ImprimerStrategy motLong8ouEnP = new Or(motEnP, motLongueur8);
        ImprimerStrategy motNotLong8 = new Not(motLongueur8);
        Compteur compteur = new Compteur(motNotLong8);
        ListerMot listerMot = new ListerMot();
        try {
            System.out.println("Mot(s) commencant par p :");
            listerMot.imprimer(args[0], motEnP);
            System.out.println("------------------------------");
            System.out.println("Mot(s) de longueur 8 :");
            listerMot.imprimer(args[0], motLongueur8);
            System.out.println("------------------------------");
            System.out.println("Mot(s) palindrome(s) :");
            listerMot.imprimer(args[0], motPalindrome);
            System.out.println("------------------------------");
            System.out.println("Mot de longueur 8 et commençant par P");
            listerMot.imprimer(args[0], motLong8EnP);
            System.out.println("------------------------------");
            System.out.println("Mot de longueur 8 ou commençant par P");
            listerMot.imprimer(args[0], motLong8ouEnP);
            System.out.println("------------------------------");
            System.out.println("Mot de longueur différente que 8");
            listerMot.imprimer(args[0], compteur);
            System.out.println("---------------");
            System.out.println(compteur.getCpt());
            System.out.println("------------------------------");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}