import java.util.Scanner;
public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        int totalTicketsPerMovie = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            String movie = input;
            int availableSeats = Integer.parseInt(scanner.nextLine());

            String ticketTypeInput = scanner.nextLine();
            while (!ticketTypeInput.equals("End")) {

                switch (ticketTypeInput) {
                    case "student":
                        studentTickets++;
                        totalTicketsPerMovie += 1;
                        break;
                    case "standard":
                        standardTickets++;
                        totalTicketsPerMovie += 1;
                        break;
                    case "kid":
                        kidTickets++;
                        totalTicketsPerMovie += 1;
                        break;
                }

                if (availableSeats == totalTicketsPerMovie) {
                    break;
                }

                ticketTypeInput = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.\n", movie, totalTicketsPerMovie * 1.0 / availableSeats * 100);

            totalTicketsPerMovie = 0;

            input = scanner.nextLine();
        }

        int totalTickets = studentTickets + standardTickets + kidTickets;
        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", studentTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", standardTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.\n", kidTickets * 1.0 / totalTickets * 100);
    }
}