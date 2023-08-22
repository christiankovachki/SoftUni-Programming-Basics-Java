import java.util.Scanner;
public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine(); // "France", "Italy" или "Germany"
        String dates = scanner.nextLine(); // "21-23", "24-27" или "28-31"
        int nightsCount = Integer.parseInt(scanner.nextLine());

        double pricePerNight = 0;

        switch (dates) {
            case "21-23":
                if (destination.equals("France")) {
                    pricePerNight = nightsCount * 30;
                } else if (destination.equals("Italy")) {
                    pricePerNight = nightsCount * 28;
                } else if (destination.equals("Germany")) {
                    pricePerNight = nightsCount * 32;
                }
                break;
            case "24-27":
                if (destination.equals("France")) {
                    pricePerNight = nightsCount * 35;
                } else if (destination.equals("Italy")) {
                    pricePerNight = nightsCount * 32;
                } else if (destination.equals("Germany")) {
                    pricePerNight = nightsCount * 37;
                }
                break;
            case "28-31":
                if (destination.equals("France")) {
                    pricePerNight = nightsCount * 40;
                } else if (destination.equals("Italy")) {
                    pricePerNight = nightsCount * 39;
                } else if (destination.equals("Germany")) {
                    pricePerNight = nightsCount * 43;
                }
                break;
        }

        System.out.printf("Easter trip to %s : %.2f leva.\n", destination, pricePerNight);

    }
}