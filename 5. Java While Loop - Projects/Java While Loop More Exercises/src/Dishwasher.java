import java.util.Scanner;
public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int detergentBottles = Integer.parseInt(scanner.nextLine()); // препарат, който ще бъде използван за миенето на чинии

        int totalDetergent = detergentBottles * 750;

        int loadingCounter = 0;
        int dishesCounter = 0;
        int potsCounter = 0;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int dishes = Integer.parseInt(input);

            loadingCounter++;

            if (loadingCounter == 3) {
                loadingCounter = 0;
                potsCounter += dishes;
                int potsDetergent = dishes * 15;
                totalDetergent -= potsDetergent;
                if (totalDetergent < 0) {
                    System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(totalDetergent));
                    break;
                }
            } else {
                dishesCounter += dishes;
                int dishesDetergent = dishes * 5;
                totalDetergent -= dishesDetergent;
                if (totalDetergent < 0) {
                    System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(totalDetergent));
                    break;
                }
            }

            input = scanner.nextLine();
        }

        if (input.equals("End")) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n", dishesCounter, potsCounter);
            System.out.printf("Leftover detergent %d ml.\n", totalDetergent);
        }
    }
}