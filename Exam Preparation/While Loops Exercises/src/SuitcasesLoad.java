import java.util.Scanner;
public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double luggageCarrierVolume = Double.parseDouble(scanner.nextLine()); // Капацитетът на багажника

        int counter = 0;
        int suitcaseCounter = 0;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            double suitcaseVolume = Double.parseDouble(input); // Обем на куфар

            counter++;
            if (counter == 3) {
                counter = 0;
                suitcaseVolume += suitcaseVolume * 0.10;
            }

            luggageCarrierVolume -= suitcaseVolume;

            if (luggageCarrierVolume < 0) {
                System.out.println("No more space!");
                System.out.printf("Statistic: %d suitcases loaded.\n", suitcaseCounter);
                break;
            }

            suitcaseCounter++;

            input = scanner.nextLine();
        }

        if (input.equals("End")) {
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.\n", suitcaseCounter);
        }

    }
}