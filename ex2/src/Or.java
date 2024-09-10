public class Or implements ImprimerStrategy {
    private ImprimerStrategy strategy1;
    private ImprimerStrategy strategy2;

    public Or(ImprimerStrategy strtgy1, ImprimerStrategy strtgy2) {
        this.strategy1 = strtgy1;
        this.strategy2 = strtgy2;
    }

    @Override
    public boolean imprimerSI(String mot) {
        if (strategy1.imprimerSI(mot) || strategy2.imprimerSI(mot))
            return true;
        return false;
    }
}
