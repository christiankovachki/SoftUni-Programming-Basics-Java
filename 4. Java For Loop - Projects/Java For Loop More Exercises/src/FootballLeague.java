import java.util.Scanner;
public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine()); // Капацитетът на стадиона
        int fansCount = Integer.parseInt(scanner.nextLine()); // Броят на всички фенове

        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;

        for (int i = 1; i <= fansCount; i++) {
            String sector = scanner.nextLine(); // Секторът, на който се намира всеки един фен – "A", "B", "V" и "G"

            switch (sector) {
                case "A":
                    sectorA++;
                    break;
                case "B":
                    sectorB++;
                    break;
                case "V":
                    sectorV++;
                    break;
                case "G":
                    sectorG++;
                    break;
            }
        }

        System.out.printf("%.2f%%\n", (sectorA * 1.0/ fansCount) * 100); // Процентът на феновете в сектор А
        System.out.printf("%.2f%%\n", (sectorB * 1.0/ fansCount) * 100); // Процентът на феновете в сектор Б
        System.out.printf("%.2f%%\n", (sectorV * 1.0/ fansCount) * 100); // Процентът на феновете в сектор В
        System.out.printf("%.2f%%\n", (sectorG * 1.0/ fansCount) * 100); // Процентът на феновете в сектор Г
        System.out.printf("%.2f%%", (fansCount * 1.0/ stadiumCapacity) * 100); // Процентът на всички фенове, спрямо капацитета на стадиона

    }
}