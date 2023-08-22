import java.util.Scanner;
public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine()); // Разстоянието в метри
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double currentNeededTime = distance * timePerMeter;
        double delay = distance / 50;
        double delayFloor = Math.floor(delay) * 30;
        double totalTime = currentNeededTime + delayFloor;

        if (totalTime >= currentRecord) {
            System.out.printf("No! He was %.2f seconds slower.\n", totalTime - currentRecord);
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.\n", totalTime);
        }

    }
}