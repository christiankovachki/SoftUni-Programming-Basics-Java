import java.util.Scanner;
public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfPlayer = scanner.nextLine();

        int initialPoints = 301;
        int successfulShots = 0;
        int unsuccessfulShots = 0;

        String input = scanner.nextLine();
        while (!input.equals("Retire")) {
            int points = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case "Single":

                    break;
                case "Double":
                    points *= 2;
                    break;
                case "Triple":
                    points *= 3;
                    break;
            }

            if (points > initialPoints) {
                unsuccessfulShots++;
            } else {
                successfulShots++;
                initialPoints -= points;
            }

            if (initialPoints == 0) {
                System.out.printf("%s won the leg with %d shots.\n", nameOfPlayer, successfulShots);
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("Retire")) {
            System.out.printf("%s retired after %d unsuccessful shots.\n", nameOfPlayer, unsuccessfulShots);
        }

    }
}