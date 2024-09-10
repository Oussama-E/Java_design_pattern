public class NombreMotObserver implements Observer{
    private int nb = 0;
    @Override
    public void traiterLigne(String ligne) {
        for (String mot : ligne.trim().split(" ")) {
            nb++;
        }
    }

    @Override
    public void render() {
        System.out.println("Nombre de mot(s) : " + nb);
    }
}
