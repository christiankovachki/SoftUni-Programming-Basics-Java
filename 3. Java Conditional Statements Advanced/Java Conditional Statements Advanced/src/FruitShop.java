import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        boolean weekDays = dayOfTheWeek.equals("Monday") || dayOfTheWeek.equals("Tuesday") || dayOfTheWeek.equals("Wednesday") || dayOfTheWeek.equals("Thursday") || dayOfTheWeek.equals("Friday");
        boolean weekEndDays = dayOfTheWeek.equals("Saturday") || dayOfTheWeek.equals("Sunday");
        boolean isValid = true;

        double price = 0.00;

        if (fruit.equals("banana") && weekDays) {
            price = quantity * 2.50;
        } else if (fruit.equals("apple") && weekDays) {
            price = quantity * 1.20;
        } else if (fruit.equals("orange") && weekDays) {
            price = quantity * 0.85;
        } else if (fruit.equals("grapefruit") && weekDays) {
            price = quantity * 1.45;
        } else if (fruit.equals("kiwi") && weekDays) {
            price = quantity * 2.70;
        } else if (fruit.equals("pineapple") && weekDays) {
            price = quantity * 5.50;
        } else if (fruit.equals("grapes") && weekDays) {
            price = quantity * 3.85;
        } else if (fruit.equals("banana") && weekEndDays) {
            price = quantity * 2.70;
        } else if (fruit.equals("apple") && weekEndDays) {
            price = quantity * 1.25;
        } else if (fruit.equals("orange") && weekEndDays) {
            price = quantity * 0.90;
        } else if (fruit.equals("grapefruit") && weekEndDays) {
            price = quantity * 1.60;
        } else if (fruit.equals("kiwi") && weekEndDays) {
            price = quantity * 3.00;
        } else if (fruit.equals("pineapple") && weekEndDays) {
            price = quantity * 5.60;
        } else if (fruit.equals("grapes") && weekEndDays) {
            price = quantity * 4.20;
        } else {
            isValid = false;
        }

            if (isValid) {
            System.out.printf("%.2f", price);
            } else {
                System.out.println("error");
            }

    }
}