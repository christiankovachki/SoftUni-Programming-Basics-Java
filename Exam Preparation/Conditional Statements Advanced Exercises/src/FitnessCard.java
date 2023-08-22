import java.util.Scanner;
public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        char sex = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double cardCost = 0;

        switch (sport) {
            case "Gym":
                if (sex == 'm') {
                    cardCost = 42;
                } else if (sex == 'f') {
                    cardCost = 35;
                }
                break;
            case "Boxing":
                if (sex == 'm') {
                    cardCost = 41;
                } else if (sex == 'f') {
                    cardCost = 37;
                }
                break;
            case "Yoga":
                if (sex == 'm') {
                    cardCost = 45;
                } else if (sex == 'f') {
                    cardCost = 42;
                }
                break;
            case "Zumba":
                if (sex == 'm') {
                    cardCost = 34;
                } else if (sex == 'f') {
                    cardCost = 31;
                }
                break;
            case "Dances":
                if (sex == 'm') {
                    cardCost = 51;
                } else if (sex == 'f') {
                    cardCost = 53;
                }
                break;
            case "Pilates":
                if (sex == 'm') {
                    cardCost = 39;
                } else if (sex == 'f') {
                    cardCost = 37;
                }
                break;
        }

        if (age <= 19) {
            cardCost = cardCost - (cardCost * 0.20);
        }

        if (cardCost <= sum) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(cardCost - sum));
        }

    }
}