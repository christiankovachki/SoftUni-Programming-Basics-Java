import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine(); // "Summer" или "Winter"

        String location = ""; // "Alaska" и "Morocco"
        String placesToStay = ""; // "Hotel", "Hut" или "Camp"
        double cost = 0.00;

        if (budget <= 1000) {
            placesToStay = "Camp";
            if (season.equals("Summer")) {
                location = "Alaska";
                cost = budget * 0.65;
            } else if (season.equals("Winter")) {
                location = "Morocco";
                cost = budget * 0.45;
            }
        } else if (budget > 1000 && budget <= 3000) {
            placesToStay = "Hut";
            if (season.equals("Summer")) {
                location = "Alaska";
                cost = budget * 0.80;
            } else if (season.equals("Winter")) {
                location = "Morocco";
                cost = budget * 0.60;
            }
        } else if (budget > 3000) {
            placesToStay = "Hotel";
            cost = budget * 0.90;
            if (season.equals("Summer")) {
                location = "Alaska";
            } else if (season.equals("Winter")) {
                location = "Morocco";
            }
        }

        System.out.printf("%s - %s - %.2f", location, placesToStay, cost);

    }
}