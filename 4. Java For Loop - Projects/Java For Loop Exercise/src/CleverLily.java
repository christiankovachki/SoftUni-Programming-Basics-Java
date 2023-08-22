import java.util.Scanner;
public class CleverLily {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine()); // Възрастта на Лили
        double washingMachinePrice = Double.parseDouble(scanner.nextLine()); // Цена на пералнята
        int toyPricePerUnit = Integer.parseInt(scanner.nextLine()); // Единична цена на играчка

        double savedMoney = 0.0;
        double brotherTax = 0.0;
        double toyCount = 0.0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) { // четни рождени дни
                // получава пари
                if (i == 2) {
                    savedMoney = 10.00;
                } else if (i > 2) {
                    savedMoney += (i / 2.0) * 10.00;
                }
                brotherTax += 1.00;
            } else { // нечетни рождени дни
                // получава играчки
                toyCount += 1;
            }
        }

        double toyProfit = toyPricePerUnit * toyCount;
        double finalSum = (toyProfit + savedMoney) - brotherTax;

        if (finalSum >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", finalSum - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - finalSum);
        }

    }
}