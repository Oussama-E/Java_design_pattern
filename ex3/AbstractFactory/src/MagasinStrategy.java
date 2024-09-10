public interface MagasinStrategy {
    void ajouterProduit(String name, int anneeDeParution);

    Produit retourneProduit(String name);
}
