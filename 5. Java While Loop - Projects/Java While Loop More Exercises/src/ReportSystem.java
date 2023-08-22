import java.util.Scanner;
public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetedMoney = Integer.parseInt(scanner.nextLine());

        int counter = 0; // използвам го, за да редувам плащане в брой и плащане с карта
        int cashPaymentCounter = 0;
        int cashPaymentTotal = 0;
        int cardPaymentCounter = 0;
        int cardPaymentTotal = 0;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int itemsPrice = Integer.parseInt(input);

            counter++;

            if (counter % 2 != 0) { // плащане в брой
                if (itemsPrice > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    cashPaymentCounter++;
                    cashPaymentTotal += itemsPrice;
                    System.out.println("Product sold!");
                }
            } else { // плащане с карта
                if (itemsPrice < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    cardPaymentCounter++;
                    cardPaymentTotal += itemsPrice;
                    System.out.println("Product sold!");

                }
            }

            if (cashPaymentTotal + cardPaymentTotal >= targetedMoney) {
                System.out.printf("Average CS: %.2f\n", cashPaymentTotal * 1.0/ cashPaymentCounter);
                System.out.printf("Average CC: %.2f\n", cardPaymentTotal * 1.0/ cardPaymentCounter);
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        }

    }
}