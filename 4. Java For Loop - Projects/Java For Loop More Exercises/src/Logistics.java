import java.util.Scanner;
public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cargoCount = Integer.parseInt(scanner.nextLine()); // броят на товарите за превоз

        int totalCargoBus = 0;
        int totalCargoTruck = 0;
        int totalCargoTrain = 0;

        for (int i = 0; i < cargoCount; i++) {
            int cargoTonnagePerUnit = Integer.parseInt(scanner.nextLine()); // За всеки един товар на отделен ред – тонажа на товара

            if (cargoTonnagePerUnit <= 3) { // микробус (200 лева на тон)
                totalCargoBus += cargoTonnagePerUnit;
            } else if (cargoTonnagePerUnit <= 11) { // камион (175 лева на тон)
                totalCargoTruck += cargoTonnagePerUnit;
            } else { // влак (120 лева на тон)
                totalCargoTrain += cargoTonnagePerUnit;
            }
        }

        int totalCargo = totalCargoBus + totalCargoTruck + totalCargoTrain; // всички товари (общ брой тона)

        System.out.printf("%.2f\n", 1.0 * (totalCargoBus * 200 + totalCargoTruck * 175 + totalCargoTrain * 120) / totalCargo); // средна цена на тон превозен товар
        System.out.printf("%.2f%%\n", (1.0 * totalCargoBus / totalCargo) * 100); // процентът тона превозвани с микробус
        System.out.printf("%.2f%%\n", (1.0 * totalCargoTruck / totalCargo) * 100); // процентът тона превозвани с камион
        System.out.printf("%.2f%%\n", (1.0 * totalCargoTrain / totalCargo) * 100); // процентът тона превозвани с влак

    }
}