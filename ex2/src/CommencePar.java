public class CommencePar implements ImprimerStrategy{
    private char lettre;

    public CommencePar(char lettre){
        this.lettre = lettre;
    }
    @Override
    public boolean imprimerSI(String mot) {
        return Character.toLowerCase(mot.charAt(0)) == Character.toLowerCase(lettre);
    }
}
