import java.util.Scanner;
public class SkiTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String housingUnit = scanner.nextLine();
        String rating = scanner.nextLine();

        double cost = 0.00;
        int nights = days - 1;

        switch (housingUnit) {
            case "room for one person":
                cost = 18.00 * nights;
                break;
            case "apartment":
                cost = 25.00 * nights;
                if (days < 10) {
                    cost = cost - (cost * 0.30);
                } else if (days <=15) {
                    cost = cost - (cost * 0.35);
                } else {
                    cost = cost - (cost * 0.50);
                }
                break;
            case "president apartment":
                cost = 35.00 * nights;
                if (days < 10) {
                    cost = cost - (cost * 0.10);
                } else if (days <=15) {
                    cost = cost - (cost * 0.15);
                } else {
                    cost = cost - (cost * 0.20);
                }
                break;
        }

        if (rating.equals("positive")) {
            cost = cost + (cost * 0.25);
        } else if (rating.equals("negative")) {
            cost = cost - (cost * 0.10);
        }

        System.out.printf("%.2f", cost);

    }
}