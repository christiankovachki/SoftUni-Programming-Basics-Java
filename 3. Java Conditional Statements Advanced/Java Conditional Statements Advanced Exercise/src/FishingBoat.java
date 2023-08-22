import java.util.Scanner;
public class FishingBoat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double rent = 0.00;

        switch (season) {
            case "Spring":
                rent = 3000.00;
                break;
            case "Winter":
                rent = 2600.00;
                break;
            case "Summer":
            case "Autumn":
                rent = 4200.00;
                break;
        }

        if (fishermen <= 6) {
            rent = rent - (rent * 0.10);
        } else if (fishermen <= 11) {
            rent = rent - (rent * 0.15);
        } else {
            rent = rent - (rent * 0.25);
        }

        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            rent = rent - (rent * 0.05);
        }

        if (budget >= rent) {
            double remainingMoney = budget - rent;
            System.out.printf("Yes! You have %.2f leva left.", remainingMoney);
        } else {
            double neededMoney = rent - budget;
            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
        }

    }
}