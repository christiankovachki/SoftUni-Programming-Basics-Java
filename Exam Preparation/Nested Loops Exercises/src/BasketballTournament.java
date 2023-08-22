import java.util.Scanner;
public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gameCounter = 0; // per tournament
        int totalGames = 0;
        int wins = 0;
        int losses = 0;

        String input = scanner.nextLine();
        while (!input.equals("End of tournaments")) {
            int fixtures = Integer.parseInt(scanner.nextLine()); // броят мачове, които се играят на ТУРНИР

            for (int i = 1; i <= fixtures; i++) {
                int teamDesiPoints = Integer.parseInt(scanner.nextLine());
                int otherTeamPoints = Integer.parseInt(scanner.nextLine());

                gameCounter++;
                totalGames++;

                if (teamDesiPoints > otherTeamPoints) {
                    wins++;
                    System.out.printf("Game %d of tournament %s: win with %d points.\n", gameCounter, input, (teamDesiPoints - otherTeamPoints));
                } else if (teamDesiPoints < otherTeamPoints) {
                    losses++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n", gameCounter, input, (otherTeamPoints - teamDesiPoints));
                }
            }

            gameCounter = 0;

            input = scanner.nextLine();
        }

        System.out.printf("%.2f%% matches win\n", wins * 1.0 / totalGames * 100);
        System.out.printf("%.2f%% matches lost\n", losses * 1.0/ totalGames * 100);

    }
}