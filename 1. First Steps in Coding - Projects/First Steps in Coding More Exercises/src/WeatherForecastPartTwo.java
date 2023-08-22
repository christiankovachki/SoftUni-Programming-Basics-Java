import java.util.Scanner;

public class WeatherForecastPartTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double celsius = Double.parseDouble(scanner.nextLine());

        if (celsius >= 26.00 && celsius <= 35.00) {
            System.out.println("Hot");
        } else if (celsius >= 20.10 && celsius <= 25.90) {
            System.out.println("Warm");
        } else if (celsius >= 15.00 && celsius <= 20.00) {
            System.out.println("Mild");
        } else if (celsius >= 12.00 && celsius <= 14.90) {
            System.out.println("Cool");
        } else if (celsius >= 5.00 && celsius <= 11.90) {
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }

    }

}
