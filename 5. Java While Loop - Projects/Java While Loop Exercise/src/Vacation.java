import java.util.Scanner;
public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double necessaryMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int daysCounter = 0;
        int spendingSpreeCounter = 0;

        double finalSum = 0;

        while (finalSum < necessaryMoney) {
            String typeOfAction = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());

            daysCounter++;

            if (typeOfAction.equals("spend")) {
                spendingSpreeCounter++;
                if (spendingSpreeCounter == 5) {
                    System.out.println("You can't save the money.");
                    System.out.printf("%d", daysCounter);
                    break;
                }
                availableMoney -= amount;
                if (availableMoney < 0) {
                    availableMoney = 0;
                }
            }

            if (typeOfAction.equals("save")) {
                spendingSpreeCounter = 0;
                availableMoney += amount;
            }

            finalSum = availableMoney;
        }

        if (finalSum >= necessaryMoney) {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }
    }
}