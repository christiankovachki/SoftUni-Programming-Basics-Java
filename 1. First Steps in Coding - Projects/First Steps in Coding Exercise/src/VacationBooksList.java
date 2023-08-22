import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysRequired = Integer.parseInt(scanner.nextLine());

        int hoursReq = numberOfPages / pagesPerHour;
        int reqHoursPerDay = hoursReq / daysRequired;

        System.out.println(reqHoursPerDay);
    }
}
