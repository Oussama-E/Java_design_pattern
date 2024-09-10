public class Compteur implements ImprimerStrategy {
    ImprimerStrategy strategy;
    int cpt=0;

    public Compteur(ImprimerStrategy strategy) {
        this.strategy = strategy;
    }

    public int getCpt() {
        return cpt;
    }

    @Override
    public boolean imprimerSI(String mot) {
        if (strategy.imprimerSI(mot)){
            cpt++;
            return true;
        }
        return false;
    }
}
