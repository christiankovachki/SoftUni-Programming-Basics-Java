import java.util.Scanner;
public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = numberOne; i <= numberTwo; i++) {
            String number = String.valueOf(i);
            for (int j = 0; j < number.length(); j++) {
                String digitText = String.valueOf(number.charAt(j));
                int digit = Integer.parseInt(digitText);

                if (j % 2 != 0) {
                    sumEven += digit;
                } else {
                    sumOdd += digit;
                }
            }

            if (sumEven == sumOdd) {
                System.out.print(number + " ");
            }
            sumEven = 0;
            sumOdd = 0;
        }
    }
}