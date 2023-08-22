import java.util.Scanner;
public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int totalSugar = 0;
        int biggestSugar = Integer.MIN_VALUE;
        int totalFlour = 0;
        int biggestFlour = Integer.MIN_VALUE;

        for (int i = 1; i <= count; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());

            if (sugar > biggestSugar) {
                biggestSugar = sugar;
            }
            if (flour > biggestFlour) {
                biggestFlour = flour;
            }

            totalSugar += sugar;
            totalFlour += flour;
        }

        double neededSugarPackets = Math.ceil(totalSugar * 1.0 / 950);
        double neededFlourPackets = Math.ceil(totalFlour * 1.0 / 750);

        System.out.printf("Sugar: %.0f\n", neededSugarPackets);
        System.out.printf("Flour: %.0f\n", neededFlourPackets);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.\n", biggestFlour, biggestSugar);
    }
}