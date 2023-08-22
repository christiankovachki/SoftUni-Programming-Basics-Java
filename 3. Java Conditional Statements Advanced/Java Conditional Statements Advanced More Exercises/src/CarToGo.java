import java.util.Scanner;
public class CarToGo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String typeOfClass = ""; // "Economy class", "Compact class" или "Luxury class"
        String typeOfCar = ""; // "Cabrio" или "Jeep"
        
        if (budget <= 100) {
            typeOfClass = "Economy class";
            if (season.equals("Summer")) {
                typeOfCar = "Cabrio";
                budget = budget * 0.35;
            } else if (season.equals("Winter")) {
                typeOfCar = "Jeep";
                budget = budget * 0.65;
            }
        } else if (budget > 100 && budget <= 500) {
            typeOfClass = "Compact class";
            if (season.equals("Summer")) {
                typeOfCar = "Cabrio";
                budget = budget * 0.45;
            } else if (season.equals("Winter")) {
                typeOfCar = "Jeep";
                budget = budget * 0.80;
            }
        } else if (budget > 500) {
            typeOfClass = "Luxury class";
            typeOfCar = "Jeep";
            budget = budget * 0.90;
        }

        System.out.println(typeOfClass);
        System.out.printf("%s - %.2f", typeOfCar, budget);
    }
}