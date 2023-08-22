import java.util.Scanner;
public class HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetedSum = Integer.parseInt(scanner.nextLine());

        int dailyTotal = 0;

        String input = scanner.nextLine();
        while (!input.equals("closed")) {

            switch (input) {
                case "haircut":
                    String hairCutType = scanner.nextLine();
                    if (hairCutType.equals("mens")) {
                        dailyTotal += 15;
                    } else if (hairCutType.equals("ladies")) {
                        dailyTotal += 20;
                    } else if (hairCutType.equals("kids")) {
                        dailyTotal += 10;
                    }
                    break;
                case "color":
                    String type = scanner.nextLine();
                    if (type.equals("touch up")) {
                        dailyTotal += 20;
                    } else if (type.equals("full color")) {
                        dailyTotal += 30;
                    }
                    break;
            }

            if (dailyTotal >= targetedSum) {
                System.out.println("You have reached your target for the day!");
                System.out.printf("Earned money: %dlv.\n", dailyTotal);
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("closed")) {
            if (dailyTotal >= targetedSum) {
                System.out.println("You have reached your target for the day!");
                System.out.printf("Earned money: %dlv.\n", dailyTotal);
            } else {
                System.out.printf("Target not reached! You need %dlv. more.\n", targetedSum - dailyTotal);
                System.out.printf("Earned money: %dlv.\n", dailyTotal);
            }
        }

    }
}