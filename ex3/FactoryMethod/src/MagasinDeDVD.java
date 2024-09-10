public class MagasinDeDVD extends Magasin{
    @Override
    public Produit create(String name, int anneeDeParution) {
        return new DVD(name, anneeDeParution);
    }
}
