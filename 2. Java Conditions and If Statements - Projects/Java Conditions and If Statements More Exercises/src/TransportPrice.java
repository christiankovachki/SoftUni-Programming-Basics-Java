import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        if (timeOfDay.equals("day") && kilometers < 20) {
            double taxiPrice = 0.70 + (0.79 * kilometers);
            System.out.printf("%.2f", taxiPrice);
        } else if (timeOfDay.equals("night") && kilometers < 20) {
            double taxiPrice = 0.70 + (0.90 * kilometers);
            System.out.printf("%.2f", taxiPrice);
        }

        if (timeOfDay.equals("day") && kilometers >= 20 && kilometers <= 99) {
            double busPrice = 0.09 * kilometers;
            System.out.printf("%.2f", busPrice);
        } else if (timeOfDay.equals("night") && kilometers >= 20 && kilometers <= 99) {
            double busPrice = 0.09 * kilometers;
            System.out.printf("%.2f", busPrice);
        }

        if (timeOfDay.equals("day") && kilometers >= 100) {
            double trainPrice = 0.06 * kilometers;
            System.out.printf("%.2f", trainPrice);
        } else if (timeOfDay.equals("night") && kilometers >= 100) {
            double trainPrice = 0.06 * kilometers;
            System.out.printf("%.2f", trainPrice);
        }
    }
}