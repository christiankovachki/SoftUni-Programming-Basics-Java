import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double puzzlesPrice = puzzles * 2.60;
        double dollsPrice = dolls * 3.00;
        double teddyBearsPrice = teddyBears * 4.10;
        double minionsPrice = minions * 8.20;
        double trucksPrice = trucks * 2.00;

        double totalSum = (puzzlesPrice + dollsPrice + teddyBearsPrice + minionsPrice + trucksPrice);
        int orderCount = puzzles + dolls + teddyBears + minions + trucks;

        if (orderCount >= 50) {
            totalSum = totalSum - (totalSum * 0.25);
        }

        totalSum = totalSum - (totalSum * 0.10);

        if (totalSum >= vacationPrice) {
            double remainingSum = totalSum - vacationPrice;
            System.out.printf("Yes! %.2f lv left.", remainingSum);
        } else if (totalSum < vacationPrice) {
            double necessarySum = vacationPrice - totalSum;
            System.out.printf("Not enough money! %.2f lv needed.", necessarySum);
        }
    }
}
