import java.util.Scanner;
public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfClients = Integer.parseInt(scanner.nextLine());

        double sumOfAllBills = 0;

        for (int i = 1; i <= numberOfClients; i++) {

            double bill = 0;
            int counter = 0;

            String input = scanner.nextLine();
            while (!input.equals("Finish")) {
                String purchase = input;

                switch (purchase) {
                    case "basket":
                        bill += 1.50;
                        counter++;
                        break;
                    case "wreath":
                        bill += 3.80;
                        counter++;
                        break;
                    case "chocolate bunny":
                        bill += 7;
                        counter++;
                        break;
                }
                input = scanner.nextLine();
            }

            if (counter % 2 == 0) {
                bill = bill - (bill * 0.2);
            }

            System.out.printf("You purchased %d items for %.2f leva.\n", counter, bill);
            sumOfAllBills += bill;
        }
        System.out.printf("Average bill per client is: %.2f leva.", sumOfAllBills / numberOfClients);
    }
}