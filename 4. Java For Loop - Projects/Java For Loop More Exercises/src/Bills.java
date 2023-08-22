import java.util.Scanner;
public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine()); // месеците, за които се търси средният разход

        double waterBill = 0.00;
        double internetBill = 0.00;
        double electricityBill = 0.00;
        double otherBills = 0.00;


        for (int i = 1; i <= months ; i++) {
            double bill = Double.parseDouble(scanner.nextLine()); // сметката за ток за всеки месец

            electricityBill += bill;
            waterBill += 20.00;
            internetBill += 15.00;
            double sumOfAll = bill + 20.00 + 15.00;
            otherBills += sumOfAll + (sumOfAll * 0.20);
        }

        double averagePerMonth = (waterBill + internetBill + electricityBill + otherBills) / months;

        System.out.printf("Electricity: %.2f lv\n", electricityBill);
        System.out.printf("Water: %.2f lv\n", waterBill);
        System.out.printf("Internet: %.2f lv\n", internetBill);
        System.out.printf("Other: %.2f lv\n", otherBills);
        System.out.printf("Average: %.2f lv\n", averagePerMonth);

    }
}