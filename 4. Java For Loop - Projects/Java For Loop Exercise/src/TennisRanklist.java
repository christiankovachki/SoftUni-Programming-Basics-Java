import java.util.Scanner;
public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentsCount = Integer.parseInt(scanner.nextLine()); // Брой турнири, в които е участвал
        int initialPoints = Integer.parseInt(scanner.nextLine()); // Начален брой точки в ранглистата

        int tournamentPoints = 0;
        int tournamentsWins = 0;

        for (int i = 0; i < tournamentsCount; i++) {
            String reachedStage = scanner.nextLine(); // Достигнат етап от турнира: "W", "F" или "SF"

            switch (reachedStage) {
                case "W": // Winner
                    tournamentsWins += 1;
                    tournamentPoints += 2000;
                    break;
                case "F": // Finalist
                    tournamentPoints += 1200;
                    break;
                case "SF": // Semi-finalist
                    tournamentPoints += 720;
                    break;
            }
        }

        System.out.printf("Final points: %d%n", initialPoints + tournamentPoints); // точките на Григор след изиграване на всички турнири
        System.out.printf("Average points: %.0f%n", Math.floor(tournamentPoints * 1.0 / tournamentsCount));
        System.out.printf("%.2f%%", (tournamentsWins * 1.0 / tournamentsCount) * 100);

    }
}