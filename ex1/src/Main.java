public class Main {
    public static void main(String[] args) {
        AnalyseurDeTexte analyseurDeTexte = new AnalyseurDeTexte();
        Observer nbLigne = new NombreLigneObserver();
        Observer nbMot = new NombreMotObserver();
        Observer nbOccurenceBelgique = new NombreMotCorrespondant("Belgique");
        Observer nbPalindrome = new NombrePalindrome();

        analyseurDeTexte.registerObserver(nbLigne);
        analyseurDeTexte.registerObserver(nbMot);
        analyseurDeTexte.registerObserver(nbOccurenceBelgique);
        analyseurDeTexte.registerObserver(nbPalindrome);

        analyseurDeTexte.readFile(args[0]);

        analyseurDeTexte.unregisterObserver(nbLigne);
        analyseurDeTexte.unregisterObserver(nbMot);
        analyseurDeTexte.unregisterObserver(nbOccurenceBelgique);
        analyseurDeTexte.unregisterObserver(nbPalindrome);

    }
}