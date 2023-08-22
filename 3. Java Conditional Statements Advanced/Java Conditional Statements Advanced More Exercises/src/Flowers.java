import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chrysanthemumsCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int tulipsCount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine(); // Spring, Summer, Autumn, Winter
        String holiday = scanner.nextLine(); // [Y – да / N - не]

        double chrysanthemumsPrice = 0.00;
        double rosesPrice = 0.00;
        double tulipsPrice = 0.00;

        switch (season) {
            case "Spring":
            case "Summer":
                if (holiday.equals("N")) {
                chrysanthemumsPrice = 2.00 * chrysanthemumsCount;
                rosesPrice = 4.10 * rosesCount;
                tulipsPrice = 2.50 * tulipsCount;
                } else if (holiday.equals("Y")) {
                chrysanthemumsPrice = (2.00 * chrysanthemumsCount) * 1.15;
                rosesPrice = (4.10 * rosesCount) * 1.15;
                tulipsPrice = (2.50 * tulipsCount) * 1.15;
            }
                break;
            case "Autumn":
            case "Winter":
                if (holiday.equals("N")) {
                chrysanthemumsPrice = 3.75 * chrysanthemumsCount;
                rosesPrice = 4.50 * rosesCount;
                tulipsPrice = 4.15 * tulipsCount;
                } else if (holiday.equals("Y")) {
                    chrysanthemumsPrice = (3.75 * chrysanthemumsCount) * 1.15;
                    rosesPrice = (4.50 * rosesCount) * 1.15;
                    tulipsPrice = (4.15 * tulipsCount) * 1.15;
                }
                break;
        }

        double bouquet = chrysanthemumsPrice + rosesPrice + tulipsPrice;

        if (season.equals("Spring") && tulipsCount > 7) {
            bouquet = bouquet - (bouquet * 0.05);
        }

        if (season.equals("Winter") && rosesCount >= 10) {
            bouquet = bouquet - (bouquet * 0.10);
        }

        if (chrysanthemumsCount + tulipsCount + rosesCount > 20) {
            bouquet = bouquet - (bouquet * 0.20);
        }

        bouquet = bouquet + 2.00; // 2.00 лв. за аранжимент
        System.out.printf("%.2f", bouquet);
    }
}