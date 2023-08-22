import java.util.Scanner;
public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int movesCount = Integer.parseInt(scanner.nextLine()); // колко хода ще има по време на играта

        int firstInterval = 0;
        int secondInterval = 0;
        int thirdInterval = 0;
        int fourthInterval = 0;
        int fifthInterval = 0;
        int invalidInterval = 0;

        double score = 0.0;

        for (int i = 0; i < movesCount; i++) {
            int numbers = Integer.parseInt(scanner.nextLine()); // числата, които се проверяват в кой интервал са

            if (numbers >= 0 && numbers <=9) {
                firstInterval++;
                score += numbers * 0.20;
            } else if (numbers >= 10 && numbers <= 19) {
                secondInterval++;
                score += numbers * 0.30;
            } else if (numbers >= 20 && numbers <= 29) {
                thirdInterval++;
                score += numbers * 0.40;
            } else if (numbers >= 30 && numbers <= 39) {
                fourthInterval++;
                score += 50.0;
            } else if (numbers >= 40 && numbers <= 50) {
                fifthInterval++;
                score += 100.0;
            } else {
                invalidInterval++;
                score = score / 2.00;
            }
        }

        int totalNumbers = firstInterval + secondInterval + thirdInterval + fourthInterval + fifthInterval + invalidInterval;

        System.out.printf("%.2f\n", score);
        System.out.printf("From 0 to 9: %.2f%%\n", (firstInterval * 1.0 / totalNumbers) * 100.0);
        System.out.printf("From 10 to 19: %.2f%%\n", (secondInterval * 1.0/ totalNumbers) * 100.0);
        System.out.printf("From 20 to 29: %.2f%%\n", (thirdInterval * 1.0 / totalNumbers) * 100.0);
        System.out.printf("From 30 to 39: %.2f%%\n", (fourthInterval * 1.0 / totalNumbers) * 100.0);
        System.out.printf("From 40 to 50: %.2f%%\n", (fifthInterval * 1.0 / totalNumbers) * 100.0);
        System.out.printf("Invalid numbers: %.2f%%", (invalidInterval * 1.0 / totalNumbers) * 100.0);

    }
}