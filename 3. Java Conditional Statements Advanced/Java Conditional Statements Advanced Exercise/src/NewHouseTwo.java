import java.util.Scanner;

public class NewHouseTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double total = 0.00;

        switch (flowers) {
            case "Roses":
                if (numberOfFlowers > 80) {
                    total = (numberOfFlowers * 5.00) - (numberOfFlowers * 5.00 * (0.10));
                } else {
                    total = numberOfFlowers * 5.00;
                }
                break;
            case "Dahlias":
                if (numberOfFlowers > 90) {
                    total = (numberOfFlowers * 3.80) - (numberOfFlowers * 3.80 * (0.15));
                } else {
                    total = numberOfFlowers * 3.80;
                }
                break;
            case "Tulips":
                if (numberOfFlowers > 80) {
                    total = (numberOfFlowers * 2.80) - (numberOfFlowers * 2.80 * (0.15));
                } else {
                    total = numberOfFlowers * 2.80;
                }
                break;
            case "Narcissus":
                if (numberOfFlowers < 120) {
                    total = numberOfFlowers * 3.00 * (1.15);
                } else {
                    total = numberOfFlowers * 3.00;
                }
                break;
            case "Gladiolus":
                if (numberOfFlowers < 80) {
                    total = numberOfFlowers * 2.50 * (1.20);
                } else {
                    total = numberOfFlowers * 2.50;
                }
                break;
        }

        if (budget >= total) {
            double remaining = budget - total;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowers, remaining);
        } else {
            double needed = total - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", needed);
        }

    }
}