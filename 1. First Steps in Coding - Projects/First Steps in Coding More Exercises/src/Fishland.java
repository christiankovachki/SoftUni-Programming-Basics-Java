import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine()); // скумрия
        double cacaPrice = Double.parseDouble(scanner.nextLine());
        double bonitoKilograms = Double.parseDouble(scanner.nextLine()); // паламуд
        double safridKilograms = Double.parseDouble(scanner.nextLine()); // сафрид
        int musselsKilograms = Integer.parseInt(scanner.nextLine()); // миди

        double bonitoPrice = bonitoKilograms * (mackerelPrice * 1.60);
        double safridPrice =  safridKilograms * (cacaPrice * 1.8);
        double musselsPrice = musselsKilograms * 7.50;

        double reqSum = bonitoPrice + safridPrice + musselsPrice;

        System.out.printf("%.2f", reqSum);
    }
}
