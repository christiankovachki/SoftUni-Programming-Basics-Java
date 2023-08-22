import java.util.Scanner;
public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        double moneyForCharity = 0.0;
        int totalWins = 0;
        int totalLosses = 0;

        for (int i = 1; i <= days; i++) {
            double dailyMoney = 0.0;
            int dailyWins = 0;
            int dailyLosses = 0;
            String input = scanner.nextLine();
            while (!input.equals("Finish")) {
                String result = scanner.nextLine(); // "win" или "lose"

                switch (result) {
                    case "win":
                        totalWins++;
                        dailyWins++;
                        dailyMoney += 20.0;
                        break;
                    case "lose":
                        totalLosses++;
                        dailyLosses++;
                        dailyMoney += 0.0;
                        break;
                }

                input = scanner.nextLine();
            }

            if (dailyWins > dailyLosses) {
                dailyMoney = dailyMoney * 1.10;
            }

            moneyForCharity += dailyMoney;
        }

        if (totalWins > totalLosses) {
            moneyForCharity = moneyForCharity * 1.20;
            System.out.printf("You won the tournament! Total raised money: %.2f\n", moneyForCharity);
        } else if (totalWins < totalLosses) {
            System.out.printf("You lost the tournament! Total raised money: %.2f\n", moneyForCharity);
        }

    }
}