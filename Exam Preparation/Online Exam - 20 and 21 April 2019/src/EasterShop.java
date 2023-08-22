import java.util.Scanner;
public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEggs = Integer.parseInt(scanner.nextLine());

        int soldEggs = 0;
        boolean notEnoughEggs = false;

        String input = scanner.nextLine();
        while (!input.equals("Close")) {
            String action = input;
            int eggs = Integer.parseInt(scanner.nextLine());

            switch (action) {
                case "Buy":
                    if (eggs > initialEggs) {
                        System.out.println("Not enough eggs in store!");
                        System.out.printf("You can buy only %d.", initialEggs);
                        notEnoughEggs = true;
                        break;
                    }
                    soldEggs += eggs;
                    initialEggs -= eggs;
                    break;
                case "Fill":
                    initialEggs += eggs;
                    break;
            }

            if (notEnoughEggs) {
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("Close")) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", soldEggs);
        }

    }
}