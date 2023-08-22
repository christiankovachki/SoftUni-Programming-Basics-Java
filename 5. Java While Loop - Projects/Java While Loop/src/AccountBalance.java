import java.util.*;
public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double balance = 0.00;

        while (!input.equals("NoMoreMoney")) {
            double fee = Double.parseDouble(input);

            if (fee < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f\n", fee);
            balance += fee;
            input = scanner.nextLine();
        }

        System.out.printf("Total: %.2f", balance);

    }
}