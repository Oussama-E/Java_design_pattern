public class NombreLigneObserver implements Observer{
    private int nb = 0;
    @Override
    public void traiterLigne(String ligne) {
        nb++;
    }

    @Override
    public void render() {
        System.out.println("Nombre de ligne(s) : " + nb);
    }
}
