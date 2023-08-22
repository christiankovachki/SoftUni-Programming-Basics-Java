import java.util.Scanner;

public class TimePlusFifteenMinutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        hour = hour * 60;
        int total = hour + minutes + 15;
        int totalInHours = total / 60;
        int totalInMinutes = total % 60;

        if (totalInHours > 23) {
            totalInHours = 0;
        }

        if (totalInMinutes < 10) {
            System.out.printf("%d:0%d", totalInHours, totalInMinutes);
        } else {
            System.out.printf("%d:%d", totalInHours, totalInMinutes);
        }
    }

}
