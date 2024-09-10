public class MagasinDeLivre extends Magasin{

    @Override
    public Produit create(String name, int anneeDeParution) {
        return new Livre(name, anneeDeParution);
    }
}
