import java.util.Scanner;
public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int climbersGroupCount = Integer.parseInt(scanner.nextLine());

        double musalaClimbers = 0.0;
        double montBlancClimbers = 0.0;
        double kilimanjaroClimbers = 0.0;
        double kTwoClimbers = 0.0;
        double everestClimbers = 0.0;

        for (int i = 0; i < climbersGroupCount; i++) {
            int climbersCount = Integer.parseInt(scanner.nextLine());

            if (climbersCount < 6) { // Мусала
                musalaClimbers += climbersCount;
            } else if (climbersCount < 13) { // Монблан
                montBlancClimbers += climbersCount;
            } else if (climbersCount < 26) { // Килиманджаро
                kilimanjaroClimbers += climbersCount;
            } else if (climbersCount < 41) { // К2
                kTwoClimbers += climbersCount;
            } else { // Еверест
                everestClimbers += climbersCount;
            }
        }

        double totalClimbersOfAllGroups = musalaClimbers + montBlancClimbers + kilimanjaroClimbers + kTwoClimbers + everestClimbers;

        System.out.printf("%.2f%%\n", (musalaClimbers / totalClimbersOfAllGroups) * 100);
        System.out.printf("%.2f%%\n", (montBlancClimbers / totalClimbersOfAllGroups) * 100);
        System.out.printf("%.2f%%\n", (kilimanjaroClimbers / totalClimbersOfAllGroups) * 100);
        System.out.printf("%.2f%%\n", (kTwoClimbers / totalClimbersOfAllGroups) * 100);
        System.out.printf("%.2f%%\n", (everestClimbers / totalClimbersOfAllGroups) * 100);

    }
}