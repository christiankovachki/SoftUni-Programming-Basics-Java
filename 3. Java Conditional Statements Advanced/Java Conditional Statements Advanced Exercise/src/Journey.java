import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double costOfVacation = 0.00;
        String vacationPlace = "";
        String vacationLocation = "";

        if (budget <= 100) {
            vacationLocation = "Bulgaria";
            switch (season) {
                case "summer":
                    vacationPlace = "Camp";
                    costOfVacation = budget * 0.30;
                    break;
                case "winter":
                    vacationPlace = "Hotel";
                    costOfVacation = budget * 0.70;
                    break;
            }
        } else if (budget <= 1000) {
            vacationLocation = "Balkans";
            switch (season) {
                case "summer":
                    vacationPlace = "Camp";
                    costOfVacation = budget * 0.40;
                    break;
                case "winter":
                    vacationPlace = "Hotel";
                    costOfVacation = budget * 0.80;
                    break;
            }
        } else {
            vacationLocation = "Europe";
            vacationPlace = "Hotel";
            costOfVacation = budget * 0.90;
        }

        System.out.printf("Somewhere in %s%n", vacationLocation);
        System.out.printf("%s - %.2f", vacationPlace, costOfVacation);
    }
}