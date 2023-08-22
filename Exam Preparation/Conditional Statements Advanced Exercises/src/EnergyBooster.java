import java.util.Scanner;
public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (fruit) {
            case "Watermelon":
                if (size.equals("small")) {
                    price = (2 * 56) * count;
                } else if (size.equals("big")) {
                    price = (5 * 28.70) * count;
                }
                break;
            case "Mango":
                if (size.equals("small")) {
                    price = (2 * 36.66) * count;
                } else if (size.equals("big")) {
                    price = (5 * 19.60) * count;
                }
                break;
            case "Pineapple":
                if (size.equals("small")) {
                    price = (2 * 42.10) * count;
                } else if (size.equals("big")) {
                    price = (5 * 24.80) * count;
                }
                break;
            case "Raspberry":
                if (size.equals("small")) {
                    price = (2 * 20) * count;
                } else if (size.equals("big")) {
                    price = (5 * 15.20) * count;
                }
                break;
        }

        if (price >= 400 && price <= 1000) {
            price = price - (price * 0.15);
        } else if (price > 1000) {
            price = price - (price * 0.5);
        }

        System.out.printf("%.2f lv. ", price);
    }
}