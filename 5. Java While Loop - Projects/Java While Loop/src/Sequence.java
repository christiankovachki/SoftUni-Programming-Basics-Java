import java.util.*;
public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int lastNumber = 1;

        while (lastNumber <= number) {
            System.out.println(lastNumber);

            lastNumber = (lastNumber * 2) + 1;
        }

    }
}