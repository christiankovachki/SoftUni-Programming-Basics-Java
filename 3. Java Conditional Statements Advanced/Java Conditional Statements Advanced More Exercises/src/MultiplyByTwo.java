import java.util.Scanner;
public class MultiplyByTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            double numbers = Double.parseDouble(scanner.nextLine());

            if (numbers < 0) {
                System.out.printf("Negative number!");
            } else {
                numbers = numbers * 2.0;
                System.out.printf("Result: %.2f%n", numbers);
            }
        }

    }
}