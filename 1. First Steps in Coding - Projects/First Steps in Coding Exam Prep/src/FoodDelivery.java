import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegan = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chicken * 10.35;
        double fishPrice = fish * 12.40;
        double veganPrice = vegan * 8.15;

        double sumOfMenus = chickenPrice + fishPrice + veganPrice;
        double desertPrice = sumOfMenus * 0.2;
        double deliveryPrice = 2.50;
        double totalPrice = sumOfMenus + desertPrice + deliveryPrice;

        System.out.println(totalPrice);

    }
}
