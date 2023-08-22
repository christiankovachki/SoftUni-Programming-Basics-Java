import java.util.Scanner;
public class HotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numberOfNights = Integer.parseInt(scanner.nextLine());

        String housingUnit = "";
        double studioPrice = 0.00;
        double apartmentPrice = 0.00;

        switch (month) {
            case "May":
            case "October":
                studioPrice = 50.0 * numberOfNights;
                if (numberOfNights > 7 && numberOfNights <= 14) {
                    studioPrice = studioPrice - (studioPrice * 0.05);
                } else if (numberOfNights > 14) {
                    studioPrice = studioPrice - (studioPrice * 0.30);
                }
                apartmentPrice = 65.0 * numberOfNights;
                if (numberOfNights > 14) {
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.20 * numberOfNights;
                if (numberOfNights > 14) {
                    studioPrice = studioPrice - (studioPrice * 0.20);
                }
                apartmentPrice = 68.70 * numberOfNights;
                if (numberOfNights > 14) {
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
                }
                break;
            case "July":
            case "August":
                studioPrice = 76.0 * numberOfNights;
                apartmentPrice = 77.0 * numberOfNights;
                if (numberOfNights > 14) {
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
                }
                break;

        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);

    }
}