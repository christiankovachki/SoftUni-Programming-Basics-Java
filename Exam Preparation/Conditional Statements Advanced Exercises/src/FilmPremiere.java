import java.util.Scanner;
public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine(); // "John Wick", "Star Wars" или "Jumanji"
        String goodies = scanner.nextLine(); // "Drink", "Popcorn" или "Menu"
        int numberOfTickets = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (movie) {
            case "John Wick":
                if (goodies.equals("Drink")) {
                    price = 12.0 * numberOfTickets;
                } else if (goodies.equals("Popcorn")) {
                    price = 15.0 * numberOfTickets;
                } else if (goodies.equals("Menu")) {
                    price = 19.0 * numberOfTickets;
                }
                break;
            case "Star Wars":
                if (goodies.equals("Drink")) {
                    price = 18.0 * numberOfTickets;
                } else if (goodies.equals("Popcorn")) {
                    price = 25.0 * numberOfTickets;
                } else if (goodies.equals("Menu")) {
                    price = 30.0 * numberOfTickets;
                }
                break;
            case "Jumanji":
                if (goodies.equals("Drink")) {
                    price = 9.0 * numberOfTickets;
                } else if (goodies.equals("Popcorn")) {
                    price = 11.0 * numberOfTickets;
                } else if (goodies.equals("Menu")) {
                    price = 14.0 * numberOfTickets;
                }
                break;
        }

        if (movie.equals("Star Wars") && numberOfTickets >= 4) {
            price = price - (price * 0.30);
        }

        if (movie.equals("Jumanji") && numberOfTickets == 2) {
            price = price - (price * 0.15);
        }

        System.out.printf("Your bill is %.2f leva.", price);

    }
}