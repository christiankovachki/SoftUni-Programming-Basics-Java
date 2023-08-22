import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometersPerMonth = Double.parseDouble(scanner.nextLine());

        double salary = 0.00;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (kilometersPerMonth <= 5000) {
                    salary = 4 * (0.75 * kilometersPerMonth); // умножава се по 4 заради това, че работи по 4 месеца
                } else if (kilometersPerMonth > 5000 && kilometersPerMonth < 10000) {
                    salary = 4 * (0.95 * kilometersPerMonth);
                } else if (kilometersPerMonth > 10000 && kilometersPerMonth <= 20000) {
                    salary = 4 * (1.45 * kilometersPerMonth);
                }
                break;
            case "Summer":
                if (kilometersPerMonth <= 5000) {
                    salary = 4 * (0.90 * kilometersPerMonth);
                } else if (kilometersPerMonth > 5000 && kilometersPerMonth < 10000) {
                    salary = 4 * (1.10 * kilometersPerMonth);
                } else if (kilometersPerMonth > 10000 && kilometersPerMonth <= 20000) {
                    salary = 4 * (1.45 * kilometersPerMonth);
                }
                break;
            case "Winter":
                if (kilometersPerMonth <= 5000) {
                    salary = 4 * (1.05 * kilometersPerMonth);
                } else if (kilometersPerMonth > 5000 && kilometersPerMonth < 10000) {
                    salary = 4 * (1.25 * kilometersPerMonth);
                } else if (kilometersPerMonth > 10000 && kilometersPerMonth <= 20000) {
                    salary = 4 * (1.45 * kilometersPerMonth);
                }
                break;
        }

        double salaryAfterTax = salary - (salary * 0.10);
        System.out.printf("%.2f", salaryAfterTax);

    }
}