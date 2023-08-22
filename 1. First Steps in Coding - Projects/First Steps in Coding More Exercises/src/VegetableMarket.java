import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double priceOfVegies = Double.parseDouble(scanner.nextLine());
        double priceOfFruits = Double.parseDouble(scanner.nextLine());
        int kgOfVegies = Integer.parseInt(scanner.nextLine());
        int kgOfFruits = Integer.parseInt(scanner.nextLine());

        double vegies = priceOfVegies * kgOfVegies;
        double fruits = priceOfFruits * kgOfFruits;

        double totalPriceLev = vegies + fruits;
        double priceInEuros = totalPriceLev / 1.94;

        System.out.printf("%.2f", priceInEuros);
    }

}
