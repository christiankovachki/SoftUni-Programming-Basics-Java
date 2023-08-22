import java.util.Scanner;
public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int numberOfJudges = Integer.parseInt(scanner.nextLine());

        boolean isNominated = false;

        for (int i = 0; i < numberOfJudges; i++) {
            String nameOfJudge = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());

            int nameLength = nameOfJudge.length();
            double pointsCalculation = nameLength * judgePoints / 2;

            academyPoints += pointsCalculation;

            if (academyPoints > 1250.5) {
                isNominated = true;
                break;
            }
        }

        if (isNominated) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!\n", name, academyPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - academyPoints);
        }

    }
}