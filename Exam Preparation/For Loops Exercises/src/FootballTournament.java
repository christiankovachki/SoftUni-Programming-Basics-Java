import java.util.Scanner;
public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String footballTeam = scanner.nextLine();
        int fixtures = Integer.parseInt(scanner.nextLine());

        if (fixtures == 0) {
            System.out.printf("%s hasn't played any games during this season.", footballTeam);
        }

        int points = 0;
        int wins = 0;
        int draws = 0;
        int losses = 0;

        for (int i = 0; i < fixtures; i++) {
            String result = scanner.nextLine(); // 'W', 'D' и 'L'

            switch (result) {
                case "W":
                    wins++;
                    points += 3;
                    break;
                case "D":
                    draws++;
                    points += 1;
                    break;
                case "L":
                    losses++;
                    points += 0;
                    break;
            }
        }

        if (fixtures != 0) {
        System.out.printf("%s has won %d points during this season.\n", footballTeam, points);
        System.out.println("Total stats:");
        System.out.printf("## W: %d\n", wins);
        System.out.printf("## D: %d\n", draws);
        System.out.printf("## L: %d\n", losses);
        System.out.printf("Win rate: %.2f%%\n", wins * 1.0 / fixtures * 100.0);
        }

    }
}