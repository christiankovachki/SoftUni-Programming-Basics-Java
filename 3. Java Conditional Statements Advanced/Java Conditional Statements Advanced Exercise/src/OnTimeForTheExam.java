import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int examTimeInHours = Integer.parseInt(scanner.nextLine()) * 60; // от час в минути
        int examTimeInMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalTimeInHours = Integer.parseInt(scanner.nextLine()) * 60; // от час в минути
        int arrivalTimeInMinutes = Integer.parseInt(scanner.nextLine());

        int examTimeTotal = examTimeInHours + examTimeInMinutes; // в минути
        int arrivalTimeTotal = arrivalTimeInHours + arrivalTimeInMinutes; // в минути

        int differenceInTime = Math.abs(examTimeTotal - arrivalTimeTotal);

        int hours = 0;
        int minutes = 0;

        if (arrivalTimeTotal > examTimeTotal) { // Late
            System.out.println("Late");
            hours = differenceInTime / 60;
            minutes = differenceInTime % 60;
            if (differenceInTime < 60) {
                System.out.printf("%d minutes after the start", minutes);
            } else {
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
        } else if (arrivalTimeTotal == examTimeTotal || differenceInTime <= 30) { // On time
            minutes = differenceInTime % 60;
            if (differenceInTime == 0) {
                System.out.println("On time");
            } else if (differenceInTime > 0) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", minutes);
            }
        } else { // Early
            System.out.println("Early");
            hours = differenceInTime / 60;
            minutes = differenceInTime % 60;
            if (differenceInTime < 60) {
                System.out.printf("%d minutes before the start", minutes);
            } else {
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            }
        }

    }
}