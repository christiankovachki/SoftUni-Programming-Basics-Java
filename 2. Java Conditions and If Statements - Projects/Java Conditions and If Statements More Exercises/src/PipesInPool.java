import java.util.Scanner;
public class PipesInPool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int poolVolumeInLiters = Integer.parseInt(scanner.nextLine());
        int flowFirstPipe = Integer.parseInt(scanner.nextLine());
        int flowSecondPipe = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double bothPipes = (flowFirstPipe + flowSecondPipe) * hours;
        double difference = poolVolumeInLiters - bothPipes;

        if (poolVolumeInLiters >= bothPipes) {
            double volume = (poolVolumeInLiters - difference) / poolVolumeInLiters * 100.0;
            double firstPipe = flowFirstPipe / ((flowFirstPipe + flowSecondPipe) / 100.0);
            double secondPipe = flowSecondPipe / ((flowFirstPipe + flowSecondPipe) / 100.0);
            System.out.println("The pool is " + volume + "% full. Pipe 1: " + firstPipe + "%. Pipe 2: " + secondPipe + "%.");
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, Math.abs(difference));
        }
    }
}