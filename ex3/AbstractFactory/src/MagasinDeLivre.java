import java.util.HashMap;
import java.util.Map;

public class MagasinDeLivre implements MagasinStrategy {
	private Map<String,Livre> etagere= new HashMap<String,Livre>();
	public void ajouterProduit(String name, int anneeDeParution){
		Livre livre=new Livre(name, anneeDeParution);
		etagere.put(name,livre);
	}
	public Livre retourneProduit(String name){
		return etagere.get(name);
	}
}
