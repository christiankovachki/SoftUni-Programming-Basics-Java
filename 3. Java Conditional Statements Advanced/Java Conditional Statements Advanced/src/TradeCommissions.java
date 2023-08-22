import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine()); // обем на продажби

        double commissions = 0;
        boolean isValid = true;

        if (city.equals("Sofia")) {
            if (s >= 0 && s <= 500) {
                commissions = 0.05;
            } else if (s > 500 && s <= 1000) {
                commissions = 0.07;
            } else if (s > 1000 && s <= 10000) {
                commissions = 0.08;
            } else if (s > 10000) {
                commissions = 0.12;
            } else {
                isValid = false;
            }
        } else if (city.equals("Varna")) {
            if (s >= 0 && s <= 500) {
                commissions = 0.045;
            } else if (s > 500 && s <= 1000) {
                commissions = 0.075;
            } else if (s > 1000 && s <= 10000) {
                commissions = 0.10;
            } else if (s > 10000) {
                commissions = 0.13;
            } else {
                isValid = false;
            }
        } else if (city.equals("Plovdiv")) {
            if (s >= 0 && s <= 500) {
                commissions = 0.055;
            } else if (s > 500 && s <= 1000) {
                commissions = 0.08;
            } else if (s > 1000 && s <= 10000) {
                commissions = 0.12;
            } else if (s > 10000) {
                commissions = 0.145;
            } else {
                isValid = false;
            }
        } else {
            isValid = false;
        }

        if (isValid) {
            System.out.printf("%.2f", s * commissions);
        } else {
            System.out.println("error");
        }

    }
}