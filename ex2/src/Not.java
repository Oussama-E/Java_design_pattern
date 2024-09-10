public class Not implements ImprimerStrategy {
    private ImprimerStrategy strategy1;

    public Not(ImprimerStrategy strtgy1){
        this.strategy1 = strtgy1;
    }
    @Override
    public boolean imprimerSI(String mot) {
        if (strategy1.imprimerSI(mot))
            return false;
        return true;
    }
}
