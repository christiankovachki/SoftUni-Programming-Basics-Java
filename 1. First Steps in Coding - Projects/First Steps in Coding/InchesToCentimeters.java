import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        double centimeters = input * 2.54;

        System.out.println(centimeters);
    }
}
