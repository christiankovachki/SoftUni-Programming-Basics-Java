import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfTheWeek = scanner.nextLine();

        boolean isValid = true;

        switch (dayOfTheWeek) {
            case "Monday":
                break;
            case "Tuesday":
                break;
            case "Wednesday":
                break;
            case "Thursday":
                break;
            case "Friday":
                break;
            case "Saturday":
                break;
            case "Sunday":
                isValid = false;
                break;
        }

        if ((hour >= 10 && hour <= 18) && isValid) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }

    }
}