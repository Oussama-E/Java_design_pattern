public class And implements ImprimerStrategy{
    private ImprimerStrategy strategy1;
    private ImprimerStrategy strategy2;

    public And(ImprimerStrategy strg1, ImprimerStrategy strg2 ){
        this.strategy1 = strg1;
        this.strategy2 = strg2;
    }
    @Override
    public boolean imprimerSI(String mot) {
        if (strategy1.imprimerSI(mot) && strategy2.imprimerSI(mot))
            return true;
        return false;
    }
}
