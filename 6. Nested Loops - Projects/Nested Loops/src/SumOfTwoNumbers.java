import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intervalStart = Integer.parseInt(scanner.nextLine());
        int intervalEnd = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int combinationCounter = 0;
        int firstNumber = 0;
        int secondNumber = 0;
        boolean isFound = false;

        for (int i = intervalStart; i <= intervalEnd; i++) {
            for (int j = intervalStart; j <= intervalEnd ; j++) {
                combinationCounter++;
                int result = i + j;
                if (result == magicNumber) {
                    firstNumber = i;
                    secondNumber = j;
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }

        if (isFound) {
        System.out.printf("Combination N:%d (%d + %d = %d)", combinationCounter, firstNumber, secondNumber, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", combinationCounter, magicNumber);
        }
    }
}