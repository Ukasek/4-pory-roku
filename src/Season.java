public enum Season {

    SPRING("Wiosna", new Months[]{Months.MARCH, Months.APRIL, Months.MAY}),
    SUMMER("Lato", new Months[]{Months.JUNE, Months.JULY, Months.AUGUST}),
    AUTUMN("Jesień", new Months[]{Months.SEPTEMBER, Months.OCTOBER, Months.NOVEMBER}),
    WINTER("Zima", new Months[]{Months.DECEMBER, Months.JANUARY, Months.FEBRUARY});

    private final String description;
    private final Months[] dividedMonths;

    Season(String description, Months[] dividedMonths) {
        this.description = description;
        this.dividedMonths = dividedMonths;
    }

    public String getDescription() {
        return description;
    }

    public Months[] getDividedMonths() {
        return dividedMonths;
    }

    public static Season takeDescription(String description) {
        Season[] seasons = values();
        for (Season season : seasons) {
            if (season.getDescription().equalsIgnoreCase(description))
                return season;
        }
        throw new IllegalArgumentException("Nieprawidłowa nazwa pory roku! ");
    }

}
