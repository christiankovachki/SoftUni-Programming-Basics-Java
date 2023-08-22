import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int juniorBikers = Integer.parseInt(scanner.nextLine());
        int seniorBikers = Integer.parseInt(scanner.nextLine());
        String track = scanner.nextLine();

        double participationFee = 0.00;

        switch (track) {
            case "trail":
                participationFee = (5.50 * juniorBikers) + (7.00 * seniorBikers);
                break;
            case "cross-country":
                participationFee = (8.00 * juniorBikers) + (9.50 * seniorBikers);
                if (juniorBikers + seniorBikers >= 50) {
                    participationFee = participationFee - (participationFee * 0.25);
                }
                break;
            case "downhill":
                participationFee = (12.25 * juniorBikers) + (13.75 * seniorBikers);
                break;
            case "road":
                participationFee = (20.00 * juniorBikers) + (21.50 * seniorBikers);
                break;
        }

        double organisationCost = participationFee * 0.05;
        double donationFee = participationFee - organisationCost;

        System.out.printf("%.2f", donationFee);

    }
}