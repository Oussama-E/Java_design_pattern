public class Longueur implements ImprimerStrategy{

    private int longueur;

    public Longueur(int longueur){
        this.longueur = longueur;
    }
    @Override
    public boolean imprimerSI(String mot) {
        return mot.length()==longueur;
    }
}
