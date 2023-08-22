import java.util.Scanner;
public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savedMoney = 0;

        String input = scanner.nextLine(); // дестинация
        while (!input.equals("End")) {
            double minBudget = Double.parseDouble(scanner.nextLine());

            for (int i = 0; savedMoney < minBudget; i++) { // i - saved money
                double money = Double.parseDouble(scanner.nextLine());
                savedMoney += money;
            }

            if (savedMoney >= minBudget) {
                System.out.printf("Going to %s!\n", input);
                savedMoney = 0;
            }

            input = scanner.nextLine();
        }
    }
}