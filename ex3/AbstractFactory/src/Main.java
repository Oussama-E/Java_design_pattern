public class Main {
    public static void main(String[] args) {
        MagasinStrategy magasinDVD = new MagasinDeDVD();
        MagasinStrategy magasinLivre = new MagasinDeLivre();
        magasinDVD.ajouterProduit("MonDVD", 2000);
        magasinDVD.ajouterProduit("MonDVD2", 2005);
        magasinLivre.ajouterProduit("MonLivre", 2010);
        magasinLivre.ajouterProduit("MonLivre2", 2015);
        System.out.println(magasinDVD.retourneProduit("MonDVD2").getAnneeDeParution());
        System.out.println(magasinLivre.retourneProduit("MonLivre2").getAnneeDeParution());
    }
}