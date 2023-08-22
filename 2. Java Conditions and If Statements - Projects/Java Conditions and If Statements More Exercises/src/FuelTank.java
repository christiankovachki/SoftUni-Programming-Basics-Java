import java.util.Scanner;
public class FuelTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String gas = scanner.nextLine();
        double litresInTheTank = Double.parseDouble(scanner.nextLine());

        if (gas.equals("Diesel")) {
            if (litresInTheTank >= 25) {
                System.out.printf("You have enough diesel.");
            } else {
                System.out.printf("Fill your tank with diesel!");
            }
        } else if (gas.equals("Gasoline")) {
            if (litresInTheTank >= 25) {
                System.out.printf("You have enough gasoline.");
            } else {
                System.out.printf("Fill your tank with gasoline!");
            }
        } else if (gas.equals("Gas")) {
            if (litresInTheTank >= 25) {
                System.out.printf("You have enough gas.");
            } else {
                System.out.printf("Fill your tank with gas!");
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}