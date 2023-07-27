import java.util.function.Function;

public enum CountryExtractor {
    UK_EXTRACTOR("uk", p -> p.uk.name(), p -> p.uk.description()),
    NL_EXTRACTOR("nl", p -> p.nl.name(), p -> p.nl.description()),
    DE_EXTRACTOR("de", p -> p.de.name(), p -> p.de.description()),
    FR_EXTRACTOR("fr", p -> p.fr.name(), p -> p.fr.description()),
    ES_EXTRACTOR("es", p -> p.es.name(), p -> p.es.description()),
    IT_EXTRACTOR("it", p -> p.it.name(), p -> p.it.description()),
    AT_EXTRACTOR("at", p -> p.at.name(), p -> p.at.description()),
    RO_EXTRACTOR("ro", p -> p.ro.name(), p -> p.ro.description());

    private String language;
    private Function<InternationalProduct, String> nameExtractor;
    private Function<InternationalProduct, String> descriptionExtractor;

    CountryExtractor(String language, Function<InternationalProduct, String> nameExtractor, Function<InternationalProduct, String> descriptionExtractor) {
        this.language = language;
        this.nameExtractor = nameExtractor;
        this.descriptionExtractor = descriptionExtractor;
    }

    public String getLanguage() {
        return language;
    }

    public Function<InternationalProduct, String> getNameExtractor() {
        return nameExtractor;
    }

    public Function<InternationalProduct, String> getDescriptionExtractor() {
        return descriptionExtractor;
    }

}
