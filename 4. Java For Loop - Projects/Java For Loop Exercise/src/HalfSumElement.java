import java.util.Scanner;
public class HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbersCount = Integer.parseInt(scanner.nextLine());

        int biggestNumber = Integer.MIN_VALUE; // в тази променлива държа последното най-голямо число, въведено от конзолата
        int sumOfAllNumbers = 0;

        for (int i = 0; i < numbersCount; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());

            sumOfAllNumbers += numbers;

            if (numbers > biggestNumber) {
                biggestNumber = numbers;
            }
        }

        if (biggestNumber == (sumOfAllNumbers - biggestNumber)) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", biggestNumber);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(biggestNumber - (sumOfAllNumbers - biggestNumber)));
        }

    }
}