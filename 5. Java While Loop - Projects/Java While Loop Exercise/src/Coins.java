import java.util.Scanner;
public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine()); // сума - рестото, което трябва да се върне

        double pennies = Math.round(change * 100.0);

        int coins = 0;

        while (pennies > 0) {
            if (pennies >= 200) {
                pennies -= 200;
                coins++;
            } else if (pennies >= 100) {
                pennies -= 100;
                coins++;
            } else if (pennies >= 50) {
                pennies -= 50;
                coins++;
            } else if (pennies >= 20) {
                pennies -= 20;
                coins++;
            } else if (pennies >= 10) {
                pennies -= 10;
                coins++;
            } else if (pennies >= 5) {
                pennies -= 5;
                coins++;
            } else if (pennies >= 2) {
                pennies -= 2;
                coins++;
            } else if (pennies >= 1) {
                pennies -= 1;
                coins++;
            }
        }

        System.out.println(coins);

    }
}