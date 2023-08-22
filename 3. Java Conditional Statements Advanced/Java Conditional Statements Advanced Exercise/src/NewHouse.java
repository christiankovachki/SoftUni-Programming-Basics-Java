import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double total = 0;

        if (flowers.equals("Roses") && numberOfFlowers > 80) {
            double roses = numberOfFlowers * 5.00;
            total = roses - (roses * 0.10);
        } else if (flowers.equals("Roses") && numberOfFlowers <= 80) {
            total = numberOfFlowers * 5.00;
        }

        if (flowers.equals("Dahlias") && numberOfFlowers > 90) {
            double dahlias = numberOfFlowers * 3.80;
            total = dahlias - (dahlias * 0.15);
        } else if (flowers.equals("Dahlias") && numberOfFlowers <= 90) {
            total = numberOfFlowers * 3.80;
        }

        if (flowers.equals("Tulips") && numberOfFlowers > 80) {
            double tulips = numberOfFlowers * 2.80;
            total = tulips - (tulips * 0.15);
        } else if (flowers.equals("Tulips") && numberOfFlowers <= 80) {
            total = numberOfFlowers * 2.80;
        }

        if (flowers.equals("Narcissus") && numberOfFlowers < 120) {
            double narcissus = numberOfFlowers * 3.00;
            total = narcissus + (narcissus * 0.15);
        } else if (flowers.equals("Narcissus") && numberOfFlowers >= 120) {
            total = numberOfFlowers * 3.00;
        }

        if (flowers.equals("Gladiolus") && numberOfFlowers < 80) {
            double gladiolus = numberOfFlowers * 2.50;
            total = gladiolus + (gladiolus * 0.20);
        } else if (flowers.equals("Gladiolus") && numberOfFlowers >= 80) {
            total = numberOfFlowers * 2.50;
        }

        if (budget >= total) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowers, (budget - total));
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", (total - budget));
            }
        }
}