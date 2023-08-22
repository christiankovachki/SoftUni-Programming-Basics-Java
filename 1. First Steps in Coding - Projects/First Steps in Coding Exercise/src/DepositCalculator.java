import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double depositedSum = Double.parseDouble(scanner.nextLine());
        int depositedTerm = Integer.parseInt(scanner.nextLine());
        double annualRate = Double.parseDouble(scanner.nextLine());

        double accruedInterest = depositedSum * (annualRate / 100);
        double monthlyRate = accruedInterest / 12;
        double sum = depositedSum + (depositedTerm * monthlyRate);

        System.out.println(sum);
    }
}
