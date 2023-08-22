import java.util.Scanner;
public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int tournamentsPoints = 0;
        int winnerCount = 0;

        for (int i = 0; i < numberOfTournaments; i++) {
            String stageOfTournament = scanner.nextLine(); // "W", "F" или "SF"

            switch (stageOfTournament) {
                case "W":
                    winnerCount++;
                    initialPoints += 2000;
                    tournamentsPoints += 2000;
                    break;
                case "F":
                    initialPoints += 1200;
                    tournamentsPoints += 1200;
                    break;
                case "SF":
                    initialPoints += 720;
                    tournamentsPoints += 720;
                    break;
            }
        }

        System.out.printf("Final points: %d\n", initialPoints);
        System.out.printf("Average points: %d\n", tournamentsPoints / numberOfTournaments);
        System.out.printf("%.2f%%\n", winnerCount * 1.0/ numberOfTournaments * 100.0);

    }
}