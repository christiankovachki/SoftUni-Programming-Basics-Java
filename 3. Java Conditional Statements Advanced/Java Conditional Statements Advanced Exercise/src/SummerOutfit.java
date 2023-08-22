import java.util.Scanner;

public class SummerOutfit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int celsius = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (timeOfDay.equals("Morning")) {
            if (celsius >= 10 && celsius <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (celsius > 18 && celsius <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        } else if (timeOfDay.equals("Afternoon")) {
            if (celsius >= 10 && celsius <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (celsius > 18 && celsius <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        } else if (timeOfDay.equals("Evening")) {
            if (celsius >= 10 && celsius <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (celsius > 18 && celsius <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }

        System.out.printf("It's %d degrees, get your %s and %s.", celsius, outfit, shoes);

    }
}