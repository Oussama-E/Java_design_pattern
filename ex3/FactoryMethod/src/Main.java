public class Main {
    public static void main(String[] args) {
        MagasinDeDVD magasinDeDVD = new MagasinDeDVD();
        MagasinDeLivre magasinDeLivre = new MagasinDeLivre();
        magasinDeDVD.ajouterProduit("MonDVD", 2000);
        magasinDeDVD.ajouterProduit("MonDVD2", 2005);
        magasinDeLivre.ajouterProduit("MonLivre", 2010);
        magasinDeLivre.ajouterProduit("MonLivre2", 2015);
        System.out.println(magasinDeDVD.retourneProduit("MonDVD").getName());
        System.out.println(magasinDeLivre.retourneProduit("MonLivre2").getAnneeDeParution());



    }
}