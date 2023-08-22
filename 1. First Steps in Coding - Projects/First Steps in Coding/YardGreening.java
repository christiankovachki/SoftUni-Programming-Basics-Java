import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());

        double priceOfSqrMeter = input * 7.61;
        double discount = priceOfSqrMeter * 0.18;
        double finalPrice = priceOfSqrMeter - discount;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.print("The discount is: " + discount + " lv.");
    }
}
