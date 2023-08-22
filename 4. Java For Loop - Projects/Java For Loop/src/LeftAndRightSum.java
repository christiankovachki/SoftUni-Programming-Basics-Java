import java.util.Scanner;
public class LeftAndRightSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbersCount = Integer.parseInt(scanner.nextLine()) * 2;

        int left = 0;
        int right = 0;

        for (int i = 0; i < numbersCount; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());

            if (i < (numbersCount / 2)) {
                left += numbers;
            } else {
                right += numbers;
            }
        }

        if ( left == right) {
            System.out.printf("Yes, sum = %d", (left + right) / 2);
        } else {
            System.out.printf("No, diff = %d", Math.abs(left - right));
        }

    }
}