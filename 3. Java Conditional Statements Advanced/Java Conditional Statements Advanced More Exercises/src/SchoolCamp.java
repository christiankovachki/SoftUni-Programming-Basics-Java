import java.util.Scanner;
public class SchoolCamp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String vacSeason = scanner.nextLine();
        String group = scanner.nextLine(); // “boys”, “girls” или “mixed”
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());

        double pricePerNight = 0.00;
        String sports = "";

        switch (vacSeason) {
            case "Winter":
                if (group.equals("boys")) {
                    sports = "Judo";
                    pricePerNight = 9.60 * nightsCount * studentsCount;
                } else if (group.equals("girls")) {
                    sports = "Gymnastics";
                    pricePerNight = 9.60 * nightsCount * studentsCount;
                } else if (group.equals("mixed")) {
                    sports = "Ski";
                    pricePerNight = 10.0 * nightsCount * studentsCount;
                }
                break;
            case "Spring":
                if (group.equals("boys")) {
                    sports = "Tennis";
                    pricePerNight = 7.20 * nightsCount * studentsCount;
                } else if (group.equals("girls")) {
                    sports = "Athletics";
                    pricePerNight = 7.20 * nightsCount * studentsCount;
                } else if (group.equals("mixed")) {
                    sports = "Cycling";
                    pricePerNight = 9.50 * nightsCount * studentsCount;
                }
                break;
            case "Summer":
                if (group.equals("boys")) {
                    sports = "Football";
                    pricePerNight = 15.0 * nightsCount * studentsCount;
                } else if (group.equals("girls")) {
                    sports = "Volleyball";
                    pricePerNight = 15.0 * nightsCount * studentsCount;
                } else if (group.equals("mixed")) {
                    sports = "Swimming";
                    pricePerNight = 20.0 * nightsCount * studentsCount;
                }
                break;
        }

        if (studentsCount >= 50) {
            pricePerNight = pricePerNight - (pricePerNight * 0.50);
        } else if (studentsCount >= 20) {
            pricePerNight = pricePerNight - (pricePerNight * 0.15);
        } else if (studentsCount >= 10) {
            pricePerNight = pricePerNight - (pricePerNight * 0.05);
        }

        System.out.printf("%s %.2f lv.", sports, pricePerNight);

    }
}