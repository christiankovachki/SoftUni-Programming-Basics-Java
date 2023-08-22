import java.util.Scanner;
public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsOfFirstPlayer = Integer.parseInt(scanner.nextLine());
        int eggsOfSecondPlayer = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("End")) {

            switch (input) {
                case "one":
                    eggsOfSecondPlayer -= 1;
                    break;
                case "two":
                    eggsOfFirstPlayer -= 1;
                    break;
            }

            if (eggsOfFirstPlayer == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.\n", eggsOfSecondPlayer);
                break;
            } else if (eggsOfSecondPlayer == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.\n", eggsOfFirstPlayer);
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("End")) {
            System.out.printf("Player one has %d eggs left.\n", eggsOfFirstPlayer);
            System.out.printf("Player two has %d eggs left.\n", eggsOfSecondPlayer);
        }
    }
}