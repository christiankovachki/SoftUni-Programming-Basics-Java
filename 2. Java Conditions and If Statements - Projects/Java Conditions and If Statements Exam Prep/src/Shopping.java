import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = videoCards * 250.0;
        double processorsPrice = processors * (videoCardsPrice * 0.35);
        double ramPrice = ram * (videoCardsPrice * 0.10);

        double total = videoCardsPrice + processorsPrice + ramPrice;;

        if ( videoCards > processors) {
            total = total - (total * 0.15);
        }

        if (budget >= total) {
            System.out.printf("You have %.2f leva left!", budget - total);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", total - budget);
        }
    }
}