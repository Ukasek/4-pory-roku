import java.util.Arrays;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        printSeasons();
        String description = insertSeason();
        printDividedSeasons(description);
    }

    static void printSeasons() {
        System.out.println("Wpisz jedną z przedstawionych pór roku: ");
        for (Season s : Season.values()) {
            System.out.println(s.getDescription());
        }
    }

    static String insertSeason() {
        Scanner scanner = new Scanner(System.in);
        String description = scanner.nextLine();
        scanner.close();
        return description;
    }

    static void printDividedSeasons(String description) {
        Season season = Season.takeDescription(description);
        System.out.println(season.getDescription() + " przypada na miesiąc: " + Arrays.toString(season.getDividedMonths()));
    }
}




