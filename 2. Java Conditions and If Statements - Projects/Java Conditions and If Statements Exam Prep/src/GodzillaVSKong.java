import java.util.Scanner;

public class GodzillaVSKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double outfitPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double extrasOutfitPrice = extras * outfitPrice;

        if (extras > 150) {
            extrasOutfitPrice = extrasOutfitPrice - (extras * (outfitPrice * 0.10));
        }

        if (decor + extrasOutfitPrice > budget) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", (decor + extrasOutfitPrice) - budget);
        } else if (decor + extrasOutfitPrice <= budget) {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budget - (decor + extrasOutfitPrice));
        }
    }
}
