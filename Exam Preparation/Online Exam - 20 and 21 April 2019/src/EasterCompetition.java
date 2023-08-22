import java.util.Scanner;
public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        String winner = "";
        int currentBakerPoints = 0;
        int biggestPoints = Integer.MIN_VALUE;

        for (int i = 1; i <= count; i++) {
            String name = scanner.nextLine();

            String input = scanner.nextLine();
            while (!input.equals("Stop")) {
                int points = Integer.parseInt(input);

                currentBakerPoints += points;

                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.\n", name, currentBakerPoints);

            if (currentBakerPoints > biggestPoints) {
                winner = name;
                biggestPoints = currentBakerPoints;
                System.out.printf("%s is the new number 1!\n", name);
            }

            currentBakerPoints = 0;
        }

        System.out.printf("%s won competition with %d points!\n", winner, biggestPoints);

    }
}