import java.util.Scanner;
public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;
        int currentMovieTickets = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            String movie = input;
            int availableSeats = Integer.parseInt(scanner.nextLine());

            String typeOfTicket = scanner.nextLine();
            while (!typeOfTicket.equals("End")) {

                switch (typeOfTicket) {
                    case "student":
                        studentCount++;
                        currentMovieTickets++;
                        break;
                    case "standard":
                        standardCount++;
                        currentMovieTickets++;
                        break;
                    case "kid":
                        kidCount++;
                        currentMovieTickets++;
                        break;
                }

                if (availableSeats == currentMovieTickets) {
                    break;
                }

                typeOfTicket = scanner.nextLine();
            }

            double fullnessOfCinema = currentMovieTickets * 1.0 / availableSeats * 100;
            System.out.printf("%s - %.2f%% full.\n", movie, fullnessOfCinema);

            currentMovieTickets = 0;
            input = scanner.nextLine();
        }

        double totalTickets = standardCount + studentCount + kidCount;
        System.out.printf("Total tickets: %.0f\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", studentCount / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", standardCount / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.\n", kidCount / totalTickets * 100);

    }
}