import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        char operator = scanner.next().charAt(0);

        double action = 0.00;

        switch (operator) {
            case '+':
                action = numOne + numTwo;
                if (action % 2 == 0) {
                    System.out.printf("%d %c %d = %.0f - " + "even", numOne, operator, numTwo, action);
                } else {
                    System.out.printf("%d %c %d = %.0f - " + "odd", numOne, operator, numTwo, action);
                }
                break;
            case '-':
                action = numOne - numTwo;
                if (action % 2 == 0) {
                    System.out.printf("%d %c %d = %.0f - " + "even", numOne, operator, numTwo, action);
                } else {
                    System.out.printf("%d %c %d = %.0f - " + "odd", numOne, operator, numTwo, action);
                }
                break;
            case '*':
                action = numOne * numTwo;
                if (action % 2 == 0) {
                    System.out.printf("%d %c %d = %.0f - " + "even", numOne, operator, numTwo, action);
                } else {
                    System.out.printf("%d %c %d = %.0f - " + "odd", numOne, operator, numTwo, action);
                }
                break;
            case '/':
                if (numTwo == 0) {
                    System.out.printf("Cannot divide %d by zero", numOne);
                } else {
                    action = (double) numOne / numTwo;
                    System.out.printf("%d / %d = %.2f", numOne, numTwo, action);
                }
                break;
            case '%':
                if (numTwo == 0) {
                    System.out.printf("Cannot divide %d by zero", numOne);
                } else {
                    action = numOne % numTwo;
                    System.out.printf("%d %% %d = %.0f", numOne, numTwo, action);
                }
                break;
        }
    }
}