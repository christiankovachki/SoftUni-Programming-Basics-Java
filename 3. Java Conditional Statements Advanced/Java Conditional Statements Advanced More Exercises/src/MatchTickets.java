import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double price = 0.00;
        double remainingSum = 0.00;

        if (category.equals("VIP")) {
            price = 499.99 * people;
            if (people >= 1 && people <=4) {
                remainingSum = budget - (budget * 0.75);
            } else if (people >= 5 && people <=9) {
                remainingSum = budget - (budget * 0.60);
            } else if (people >= 10 && people <=24) {
                remainingSum = budget - (budget * 0.50);
            } else if (people >= 25 && people <=49) {
                remainingSum = budget - (budget * 0.40);
            } else if (people >= 50) {
                remainingSum = budget - (budget * 0.25);
            }
        } else if (category.equals("Normal")) {
            price = 249.99 * people;
            if (people >= 1 && people <=4) {
                remainingSum = budget - (budget * 0.75);
            } else if (people >= 5 && people <=9) {
                remainingSum = budget - (budget * 0.60);
            } else if (people >= 10 && people <=24) {
                remainingSum = budget - (budget * 0.50);
            } else if (people >= 25 && people <=49) {
                remainingSum = budget - (budget * 0.40);
            } else if (people >= 50) {
                remainingSum = budget - (budget * 0.25);
            }
        }

        if (remainingSum >= price) {
            System.out.printf("Yes! You have %.2f leva left.", remainingSum - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - remainingSum);
        }

    }
}