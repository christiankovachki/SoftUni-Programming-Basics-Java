import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double currentRecord = Double.parseDouble(scanner.nextLine());
        double distanceToSwim = Double.parseDouble(scanner.nextLine());
        double distanceTimeForMeter = Double.parseDouble(scanner.nextLine());

        double delayedTimes = Math.floor(distanceToSwim / 15.0);
        double totalTime = (distanceToSwim * distanceTimeForMeter) + delayedTimes * 12.5;
        double difference = totalTime - currentRecord;

        if (totalTime < currentRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else if (totalTime >= currentRecord) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }
    }
}