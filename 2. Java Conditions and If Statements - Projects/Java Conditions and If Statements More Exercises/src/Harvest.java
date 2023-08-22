import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int vineyard = Integer.parseInt(scanner.nextLine());
        double grapes = Double.parseDouble(scanner.nextLine());
        int requiredLiters = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double total = vineyard * grapes;
        double producedWine = 0.40 * (total / 2.50);

        if (producedWine >= requiredLiters) {
            double remainingLiters = producedWine - requiredLiters;
            double wineForWorkers = remainingLiters / workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(producedWine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(remainingLiters), Math.ceil(wineForWorkers));
        } else {
            double neededLiters = requiredLiters - producedWine;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(neededLiters));
        }
    }
}
