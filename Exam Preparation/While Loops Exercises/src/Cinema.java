import java.util.Scanner;
public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallCapacity = Integer.parseInt(scanner.nextLine());

        int ticketPrice = 5;
        int totalBill = 0;
        int seatsCounter = 0;

        String input = scanner.nextLine();
        while (!input.equals("Movie time!")) {
            int peopleEntering = Integer.parseInt(input);

            seatsCounter += peopleEntering;

            if (seatsCounter > hallCapacity) {
                System.out.println("The cinema is full.");
                break;
            }

            if (peopleEntering % 3 == 0) {
                totalBill -= 5;
            }

            totalBill += peopleEntering * ticketPrice;

            input = scanner.nextLine();
        }

        if (input.equals("Movie time!")) {
            System.out.printf("There are %d seats left in the cinema.\n", hallCapacity - seatsCounter);
        }

        System.out.printf("Cinema income - %d lv.", totalBill);

    }
}