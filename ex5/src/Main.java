public class Main {
    public static void main(String[] args) {
        Album lonerism = new ConcreteAlbum.Builder("Lonerism",
                "Tame Impala").artistCountry("Australie").publicationYear(2012).genre("indie rock").build(); Album
                orange = new ConcreteAlbum.Builder("channel ORANGE",
                "Frank Ocean").publicationYear(2012).genre("R&B").build();
        Album visions = new ConcreteAlbum.Builder("Visions",
                "Grimes").publicationYear(2012).label("4AD").genre("Electronic").build();

    }
}