import java.util.*;
public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (sum < initialNumber) {
            int numbers = Integer.parseInt(scanner.nextLine());
            sum += numbers;
        }

        System.out.println(sum);

    }
}