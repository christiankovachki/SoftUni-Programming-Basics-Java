import java.util.Scanner;
public class SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine(); // "room for one person",  "apartment" или "president apartment"
        String feedback = scanner.nextLine(); // "positive"  или "negative"

        double pricePerNight = 0;

        switch (room) {
            case "room for one person":
                pricePerNight = 18.0 * (days - 1);
                break;
            case "apartment":
                pricePerNight = 25.0 * (days - 1);
                if (days < 10) {
                    pricePerNight = pricePerNight - (pricePerNight * 0.30);
                } else if (days <= 15) {
                    pricePerNight = pricePerNight - (pricePerNight * 0.35);
                } else {
                    pricePerNight = pricePerNight - (pricePerNight * 0.5);
                }
                break;
            case "president apartment":
                pricePerNight = 35.0 * (days - 1);
                if (days < 10) {
                    pricePerNight = pricePerNight - (pricePerNight * 0.10);
                } else if (days <= 15) {
                    pricePerNight = pricePerNight - (pricePerNight * 0.15);
                } else {
                    pricePerNight = pricePerNight - (pricePerNight * 0.2);
                }
                break;
        }

        if (feedback.equals("positive")) {
            pricePerNight = pricePerNight * 1.25;
        } else if (feedback.equals("negative")) {
            pricePerNight = pricePerNight - (pricePerNight * 0.1);
        }

        System.out.printf("%.2f", pricePerNight);

    }
}