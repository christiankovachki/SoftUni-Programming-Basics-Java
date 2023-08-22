import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pencils = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int litres = Integer.parseInt(scanner.nextLine());
        int discountRate = Integer.parseInt(scanner.nextLine());

        double pencilsPrice = pencils * 5.80;
        double markersPrice = markers * 7.20;
        double compoundPrice = litres * 1.20;

        double sum = pencilsPrice + markersPrice + compoundPrice;
        double finalSum = sum - (sum * (discountRate / 100.0));

        System.out.println(finalSum);
    }
}
