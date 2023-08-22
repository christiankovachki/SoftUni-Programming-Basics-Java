import java.util.Scanner;
public class NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentPoints = 0;
        int biggestPoints = Integer.MIN_VALUE;
        String winner = "";

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String playerName = input;

            for (int i = 0; i < playerName.length(); i++) {
                int number = Integer.parseInt(scanner.nextLine());
                char letter = playerName.charAt(i);

                if (letter == number) {
                    currentPoints += 10;
                } else {
                    currentPoints += 2;
                }

                if (currentPoints > biggestPoints) {
                    biggestPoints = currentPoints;
                    winner = playerName;
                } else if (currentPoints == biggestPoints) {
                    winner = playerName;
                }
            }

            currentPoints = 0;
            input = scanner.nextLine();
        }

        System.out.printf("The winner is %s with %d points!", winner, biggestPoints);
    }
}