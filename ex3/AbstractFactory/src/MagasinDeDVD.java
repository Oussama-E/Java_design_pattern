import java.util.HashMap;
import java.util.Map;


public class MagasinDeDVD implements MagasinStrategy {
	private Map<String,DVD> bac= new HashMap<String,DVD>();
	@Override
	public void ajouterProduit(String name, int anneeDeParution){
		DVD dvd=new DVD(name, anneeDeParution);
		bac.put(name,dvd);
	}
	@Override
	public DVD retourneProduit(String name){
		return bac.get(name);
	}
}
