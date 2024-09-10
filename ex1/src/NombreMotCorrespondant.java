public class NombreMotCorrespondant implements Observer{
    private int nb = 0;
    private String mot;

    public NombreMotCorrespondant(String motRecherche){
        this.mot = motRecherche;
    }
    @Override
    public void traiterLigne(String ligne) {
        if (ligne.contains(mot)) {
            nb++;
        }
    }

    @Override
    public void render() {
        System.out.println("Occurence du mot '" + mot + "' : " + nb);
    }

}
