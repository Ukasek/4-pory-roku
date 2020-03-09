public enum Months {
    DECEMBER("Grudzień"),
    JANUARY("Styczeń"),
    FEBRUARY("Luty"),
    MARCH("Marzec"),
    APRIL("Kwiecień"),
    MAY("Maj"),
    JUNE("Czerwiec"),
    JULY("Lipiec"),
    AUGUST("Sierpień"),
    SEPTEMBER("Wrzesień"),
    OCTOBER("Październik"),
    NOVEMBER("Listopad");

    private final String description;

    Months(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
