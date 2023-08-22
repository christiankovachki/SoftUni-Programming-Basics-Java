import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int remainingFoodInKilos = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDay = Double.parseDouble(scanner.nextLine());
        double catFoodPerDay = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDay = Double.parseDouble(scanner.nextLine()) / 1000;

        double requiredFood = (days * dogFoodPerDay) + (days * catFoodPerDay) + (days * turtleFoodPerDay);

        if (remainingFoodInKilos >= requiredFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(remainingFoodInKilos - requiredFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(requiredFood - remainingFoodInKilos));
        }
    }
}