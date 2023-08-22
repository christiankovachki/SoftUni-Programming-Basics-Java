import java.util.Scanner;
public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstPlayer = scanner.nextLine();
        String secondPlayer = scanner.nextLine();

        int firstPlayerPoints = 0;
        int secondPlayerPoints = 0;
        String winner = "";
        int winnerPoints = 0;

        String input = scanner.nextLine();
        while (!input.equals("End of game")) {
            int firstPlayerCard = Integer.parseInt(input);
            int secondPlayerCard = Integer.parseInt(scanner.nextLine());

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerPoints += firstPlayerCard - secondPlayerCard;
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayerPoints += secondPlayerCard - firstPlayerCard;
            } else {
                firstPlayerCard = Integer.parseInt(scanner.nextLine());
                secondPlayerCard = Integer.parseInt(scanner.nextLine());
                if (firstPlayerCard > secondPlayerCard) {
                    winner = firstPlayer;
                    winnerPoints = firstPlayerPoints;
                } else if (secondPlayerCard > firstPlayerCard) {
                    winner = secondPlayer;
                    winnerPoints = secondPlayerPoints;
                }
                System.out.println("Number wars!");
                System.out.printf("%s is winner with %d points", winner, winnerPoints);
                break;
            }
            input = scanner.nextLine();
        }

        if (input.equals("End of game")) {
            System.out.printf("%s has %d points\n", firstPlayer, firstPlayerPoints);
            System.out.printf("%s has %d points\n", secondPlayer, secondPlayerPoints);
        }

    }
}