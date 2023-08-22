import java.util.Scanner;
public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int redEggs = 0;
        int orangeEggs = 0;
        int blueEggs = 0;
        int greenEggs = 0;
        int maxEggs = Integer.MIN_VALUE;
        String maxEggsColor = "";

        for (int i = 1; i <= count; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    redEggs++;
                    break;
                case "orange":
                    orangeEggs++;
                    break;
                case "blue":
                    blueEggs++;
                    break;
                case "green":
                    greenEggs++;
                    break;
            }
        }

        if (redEggs > maxEggs) {
            maxEggs = redEggs;
            maxEggsColor = "red";
        }

        if (orangeEggs > maxEggs) {
            maxEggs = orangeEggs;
            maxEggsColor = "orange";
        }

        if (blueEggs > maxEggs) {
            maxEggs = blueEggs;
            maxEggsColor = "blue";
        }

        if (greenEggs > maxEggs) {
            maxEggs = greenEggs;
            maxEggsColor = "green";
        }

        System.out.printf("Red eggs: %d\n", redEggs);
        System.out.printf("Orange eggs: %d\n", orangeEggs);
        System.out.printf("Blue eggs: %d\n", blueEggs);
        System.out.printf("Green eggs: %d\n", greenEggs);
        System.out.printf("Max eggs: %d -> %s\n", maxEggs, maxEggsColor);

    }
}