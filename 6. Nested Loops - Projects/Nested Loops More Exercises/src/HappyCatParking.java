import java.util.Scanner;
public class HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDays = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double dailyParkingPrice = 0;
        double total = 0;

        for (int i = 1; i <= numberOfDays; i++) {
            for (int j = 1; j <= hours; j++) {

                if (i % 2 == 0 && j % 2 != 0) {
                    dailyParkingPrice += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    dailyParkingPrice += 1.25;
                } else {
                    dailyParkingPrice += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva\n", i, dailyParkingPrice);
            total += dailyParkingPrice;
            dailyParkingPrice = 0;
        }
        System.out.printf("Total: %.2f leva", total);
    }
}