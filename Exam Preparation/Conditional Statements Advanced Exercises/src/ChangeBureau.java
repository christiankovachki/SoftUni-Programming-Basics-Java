import java.util.Scanner;
public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoinsCount = Integer.parseInt(scanner.nextLine());
        double yuanCount = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine()) / 100;

        double bitcoinPrice = 1168 * bitcoinsCount; // в лева
        double yuanPrice = 0.15 * yuanCount; // в долари

        yuanPrice = yuanPrice * 1.76; // в лева

        double total = (bitcoinPrice + yuanPrice) / 1.95;
        double afterCommission = total - (total * commission);

        System.out.printf("%.2f", afterCommission);
    }
}