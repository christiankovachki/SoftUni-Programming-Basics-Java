import java.util.Scanner;

public class NumbersToOneInReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }

    }
}