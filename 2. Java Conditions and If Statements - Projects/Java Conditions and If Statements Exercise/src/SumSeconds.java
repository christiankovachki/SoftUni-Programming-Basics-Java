import java.util.Scanner;

public class SumSeconds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstPlayer = Integer.parseInt(scanner.nextLine());
        int secondPlayer = Integer.parseInt(scanner.nextLine());
        int thirdPlayer = Integer.parseInt(scanner.nextLine());

        int total = firstPlayer + secondPlayer + thirdPlayer;

        int minutes = total / 60;
        int seconds = total % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
