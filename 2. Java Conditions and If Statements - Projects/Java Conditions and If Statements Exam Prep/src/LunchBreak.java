import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String tvSeries = scanner.nextLine();
        int lengthOfEpisode = Integer.parseInt(scanner.nextLine());
        int lengthOfLunchBreak = Integer.parseInt(scanner.nextLine());

        double lunchTime = (0.125 * lengthOfLunchBreak);
        double relaxTime = (0.250 * lengthOfLunchBreak);

        double remainingTime = (lengthOfLunchBreak - (lunchTime + relaxTime));

        if (remainingTime >= lengthOfEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", tvSeries, Math.ceil(remainingTime - lengthOfEpisode));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", tvSeries, Math.ceil(lengthOfEpisode - remainingTime));
        }

    }
}