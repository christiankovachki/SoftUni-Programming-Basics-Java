import java.util.Scanner;
public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int joineryCount = Integer.parseInt(scanner.nextLine());
        String joineryType = scanner.nextLine(); // "90X130" или "100X150" или "130X180" или "200X300";
        String shipment = scanner.nextLine(); // "With delivery" или "Without delivery"

        boolean isValid = true;

        if (joineryCount < 10) {
            System.out.println("Invalid order");
            isValid = false;
        }

        double price = 0.0;

        switch (joineryType) {
            case "90X130":
                price = 110 * joineryCount;
                if (joineryCount > 30 && joineryCount <= 60) {
                    price = price - (price * 0.05);
                } else if (joineryCount > 60) {
                    price = price - (price * 0.08);
                }
                break;
            case "100X150":
                price = 140 * joineryCount;
                if (joineryCount > 40 && joineryCount <= 80) {
                    price = price - (price * 0.06);
                } else if (joineryCount > 80) {
                    price = price - (price * 0.1);
                }
                break;
            case "130X180":
                price = 190 * joineryCount;
                if (joineryCount > 20 && joineryCount <= 50) {
                    price = price - (price * 0.07);
                } else if (joineryCount > 50) {
                    price = price - (price * 0.12);
                }
                break;
            case "200X300":
                price = 250 * joineryCount;
                if (joineryCount > 25 && joineryCount <= 50) {
                    price = price - (price * 0.09);
                } else if (joineryCount > 50) {
                    price = price - (price * 0.14);
                }
                break;
        }

        if (shipment.equals("With delivery")) {
            price += 60;
        }

        if (joineryCount > 99) {
            price = price - (price * 0.04);
        }

        if (isValid) {
        System.out.printf("%.2f BGN", price);
        }

    }
}