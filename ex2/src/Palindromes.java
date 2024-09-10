public class Palindromes implements ImprimerStrategy{
    @Override
    public boolean imprimerSI(String mot) {
        if (mot == null)
            return false;
        StringBuffer stringbuffer = new StringBuffer(mot);
        return mot.equals(stringbuffer.reverse().toString());
    }
}
