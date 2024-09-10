public class ConcreteAlbum implements Album {
    private final String title;
    private final String artistName;
    private final String label;
    private final String producer;
    private final String artistCountry;
    private final String version;
    private final String genre;
    private final int publicationYear;
    private final int originalPublicationYear;
    private final int standardDebit;
    private final int subscriberDebit;

    private ConcreteAlbum(Builder builder){
        this.title = builder.title;
        this.artistName = builder.artistName;
        this.label = builder.label;
        this.producer = builder.producer;
        this.artistCountry = builder.artistCountry;
        this.version = builder.version;
        this.genre = builder.genre;
        this.publicationYear = builder.publicationYear;
        this.originalPublicationYear = builder.originalPublicationYear;
        this.standardDebit = builder.standardDebit;
        this.subscriberDebit = builder.subscriberDebit;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getArtistName() {
        return artistName;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getProducer() {
        return producer;
    }

    @Override
    public String getArtistCountry() {
        return artistCountry;
    }

    @Override
    public String getVersion() {
        return version;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public int getOriginalPublicationYear() {
        return originalPublicationYear;
    }

    @Override
    public int getStandardDebit() {
        return standardDebit;
    }

    @Override
    public int getSubscriberDebit() {
        return subscriberDebit;
    }

    public static class Builder{
        private final String title;
        private final String artistName;
        private String label;
        private String producer;
        private String artistCountry;
        private String version;
        private String genre;
        private int publicationYear;
        private int originalPublicationYear;
        private int standardDebit;
        private int subscriberDebit;

        public Builder(String title, String artistName){
            this.title = title;
            this.artistName = artistName;
        }

        public Builder label(String label){
            this.label = label;
            return this;
        }

        public Builder producer(String producer){
            this.producer = producer;
            return this;
        }

        public Builder artistCountry(String artistCountry){
            this.artistCountry = artistCountry;
            return this;
        }

        public Builder version(String version){
            this.version = version;
            return this;
        }

        public Builder genre(String genre){
            this.genre = genre;
            return this;
        }

        public Builder publicationYear(int publicationYear){
            this.publicationYear = publicationYear;
            return this;
        }

        public Builder originalPublicationYear(int originalPublicationYear){
            this.originalPublicationYear = originalPublicationYear;
            return this;
        }

        public Builder standardDebit(int standardDebit){
            this.standardDebit = standardDebit;
            return this;
        }

        public Builder subscriberDebit(int subscriberDebit){
            this.subscriberDebit = subscriberDebit;
            return this;
        }

        public ConcreteAlbum build () {
            return new ConcreteAlbum(this);
        }

    }
}
