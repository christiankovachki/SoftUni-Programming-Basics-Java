import java.util.Scanner;

public class FuelTankPartTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double fuelAmount = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        double gasoline = 0;
        double diesel = 0;
        double gas = 0;

        if (fuel.equals("Gas")) {
            if (card.equals("Yes")) {
                gas = fuelAmount * (0.93 - 0.08);
                    if (fuelAmount >= 20 && fuelAmount <= 25) {
                        gas = gas - (gas * 0.08);
                    } else if (fuelAmount > 25) {
                        gas = gas - (gas * 0.10);
                    }
            } else if (card.equals("No")) {
                gas = fuelAmount * 0.93;
                    if (fuelAmount >= 20 && fuelAmount <= 25) {
                        gas = gas - (gas * 0.08);
                    } else if (fuelAmount > 25) {
                        gas = gas - (gas * 0.10);
                    }
            }
            System.out.printf("%.2f lv.", gas);
        }

        if (fuel.equals("Gasoline")) {
            if (card.equals("Yes")) {
                gasoline = fuelAmount * (2.22 - 0.18);
                if (fuelAmount >= 20 && fuelAmount <= 25) {
                    gasoline = gasoline - (gasoline * 0.08);
                } else if (fuelAmount > 25) {
                    gasoline = gasoline - (gasoline * 0.10);
                }
            } else if (card.equals("No")) {
                gasoline = fuelAmount * 2.22;
                if (fuelAmount >= 20 && fuelAmount <= 25) {
                    gasoline = gasoline - (gasoline * 0.08);
                } else if (fuelAmount > 25) {
                    gasoline = gasoline - (gasoline * 0.10);
                }
            }
            System.out.printf("%.2f lv.", gasoline);
        }

        if (fuel.equals("Diesel")) {
            if (card.equals("Yes")) {
                diesel = fuelAmount * (2.33 - 0.12);
                if (fuelAmount >= 20 && fuelAmount <= 25) {
                    diesel = diesel - (diesel * 0.08);
                } else if (fuelAmount > 25) {
                    diesel = diesel - (diesel * 0.10);
                }
            } else if (card.equals("No")) {
                diesel = fuelAmount * 2.33;
                if (fuelAmount >= 20 && fuelAmount <= 25) {
                    diesel = diesel - (diesel * 0.08);
                } else if (fuelAmount > 25) {
                    diesel = diesel - (diesel * 0.10);
                }
            }
            System.out.printf("%.2f lv.", diesel);
        }
    }
}