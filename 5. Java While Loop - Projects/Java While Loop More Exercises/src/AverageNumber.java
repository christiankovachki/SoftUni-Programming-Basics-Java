import java.util.Scanner;
public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            sum += numbers;
        }

        System.out.printf("%.2f", sum * 1.0 / n);

    }
}