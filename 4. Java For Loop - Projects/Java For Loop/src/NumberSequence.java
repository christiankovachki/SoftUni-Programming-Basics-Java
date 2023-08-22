import java.util.Scanner;
public class NumberSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int biggestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number > biggestNumber) {
                biggestNumber = number;
            }

            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }

        System.out.printf("Max number: %d%n", biggestNumber);
        System.out.printf("Min number: %d", smallestNumber);

    }
}