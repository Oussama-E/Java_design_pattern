import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ListerMot {
    public void imprimer(String fichier, ImprimerStrategy strategy) throws IOException {
        BufferedReader input = new BufferedReader(
                new FileReader(fichier));
        String buffer = null;
        while ((buffer = input.readLine()) != null) {
            StringTokenizer mots = new StringTokenizer(buffer,
                    " \t.;(){}\"'*=:!/\\");
            while (mots.hasMoreTokens()) {
                String mot = mots.nextToken();
                if(strategy.imprimerSI(mot))
                    System.out.println(mot);
            }
        }
    }
}
