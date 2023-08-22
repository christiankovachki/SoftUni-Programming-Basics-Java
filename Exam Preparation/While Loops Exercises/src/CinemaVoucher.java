import java.util.Scanner;
public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucherValue = Integer.parseInt(scanner.nextLine());

        int ticketsCount = 0;
        int otherCount = 0;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String typeOfPurchase = input;

            int price = 0;

            if (typeOfPurchase.length() > 8) {
                for (int i = 0; i < 2; i++) {
                    char letter = typeOfPurchase.charAt(i);
                    price += letter;
                }
                if (price <= voucherValue) {
                    voucherValue -= price;
                    ticketsCount++;
                } else {
                    break;
                }
            } else {
                price = typeOfPurchase.charAt(0);
                if (price <= voucherValue) {
                    voucherValue -= price;
                    otherCount++;;
                } else {
                    break;
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(ticketsCount);
        System.out.println(otherCount);

    }
}