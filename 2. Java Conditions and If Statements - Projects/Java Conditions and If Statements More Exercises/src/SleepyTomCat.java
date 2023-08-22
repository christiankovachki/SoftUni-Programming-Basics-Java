import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int restDays = Integer.parseInt(scanner.nextLine());

        int playTime = ((365 - restDays) * 63) + (restDays * 127);

        if (playTime > 30000) {
            int difference = playTime - 30000;
            int hours = difference / 60;
            int minutes = difference % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        } else {
            int difference = 30000 - playTime;
            int hours = difference / 60;
            int minutes = difference % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }
    }
}
