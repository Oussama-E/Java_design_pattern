import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AnalyseurDeTexte {
   public ArrayList<Observer> list = new ArrayList<>();

   public void registerObserver(Observer o){
        list.add(o);
   }

   public void unregisterObserver(Observer o){
        list.remove(o);
   }

   public void readFile(String arg){
       String ligne;
       try (BufferedReader lecteurAvecBuffer = new BufferedReader(new FileReader(arg))) {
           while ((ligne = lecteurAvecBuffer.readLine()) != null) {
               notifyObserver(ligne);
           }
           askRender();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

   }

   public void askRender(){
       for (Observer o: list) {
           o.render();
       }
   }
   public void notifyObserver(String l){
       for (Observer o: list) {
            o.traiterLigne(l);
       }
   }
}
