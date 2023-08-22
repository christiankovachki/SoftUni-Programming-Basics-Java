import java.util.Scanner;
public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double shirtPrice = Double.parseDouble(scanner.nextLine());
        double targetedSum = Double.parseDouble(scanner.nextLine());

        double shortsPrice = shirtPrice * 0.75;
        double socksPrice = shortsPrice * 0.20;
        double shoesPrice = 2 * (shortsPrice + shirtPrice);

        double total = shirtPrice + shortsPrice + socksPrice + shoesPrice;

        double afterCard = total - (total * 0.15);

        if (afterCard >= targetedSum) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.\n", afterCard);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", targetedSum - afterCard);
        }
    }
}