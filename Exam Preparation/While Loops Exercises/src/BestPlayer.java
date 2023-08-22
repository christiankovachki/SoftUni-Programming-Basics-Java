import java.util.Scanner;
public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String footballPlayer = "";
        int currentGoalScorer = Integer.MIN_VALUE;

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            int scoredGoals = Integer.parseInt(scanner.nextLine());

            if (scoredGoals > currentGoalScorer) {
                footballPlayer = input;
                currentGoalScorer = scoredGoals;
            }

            if (scoredGoals >= 10) {
                System.out.printf("%s is the best player!\n", footballPlayer);
                System.out.printf("He has scored %d goals and made a hat-trick !!!\n", currentGoalScorer);
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("END")) {
            System.out.printf("%s is the best player!\n", footballPlayer);
            if (currentGoalScorer >= 3) {
                System.out.printf("He has scored %d goals and made a hat-trick !!!\n", currentGoalScorer);
            } else {
                System.out.printf("He has scored %d goals.", currentGoalScorer);
            }
        }

    }
}