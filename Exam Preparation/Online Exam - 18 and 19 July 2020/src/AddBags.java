import java.util.Scanner;
public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double luggagePrice = Double.parseDouble(scanner.nextLine()); // Цената на багаж над 20кг
        double luggageKilos = Double.parseDouble(scanner.nextLine()); // Килограми на багажа
        int daysUntilTheTrip = Integer.parseInt(scanner.nextLine()); // Дни до пътуването
        int luggageCount = Integer.parseInt(scanner.nextLine()); // Брой багажи

        double price = 0.0;

        if (luggageKilos < 10) {
            price = luggagePrice * 0.2;
        } else if (luggageKilos >= 10 && luggageKilos <= 20) {
            price = luggagePrice * 0.5;
        } else if (luggageKilos > 20) {
            price = luggagePrice;
        }

        if (daysUntilTheTrip < 7) {
            price = price * 1.4;
        } else if (daysUntilTheTrip <= 30) {
            price = price * 1.15;
        } else {
            price = price * 1.1;
        }

        System.out.printf("The total price of bags is: %.2f lv.\n", price * luggageCount);

    }
}