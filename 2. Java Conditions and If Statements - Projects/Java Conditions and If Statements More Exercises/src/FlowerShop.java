import java.util.Scanner;
public class FlowerShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine()); // магнолии
        int hyacinths = Integer.parseInt(scanner.nextLine()); // зюмбюли
        int roses = Integer.parseInt(scanner.nextLine()); // рози
        int cactuses = Integer.parseInt(scanner.nextLine()); // кактуси
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double profit = (magnolias * 3.25) + (hyacinths * 4.00) + (roses * 3.50) + (cactuses * 8.00);
        double profitAfterTax = profit - (profit * 0.05);

        if (profitAfterTax >= presentPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(profitAfterTax - presentPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(presentPrice - profitAfterTax));
        }
    }
}
