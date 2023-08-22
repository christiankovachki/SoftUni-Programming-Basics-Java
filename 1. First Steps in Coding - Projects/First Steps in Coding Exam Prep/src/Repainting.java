import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hoursRequired = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = (paint + (paint * 0.10)) * 14.50;
        double thinnerPrice = thinner * 5.00;
        double bagPrice = 0.40;

        double totalSumOfMaterials = nylonPrice + paintPrice + thinnerPrice + bagPrice;
        double workersPay = (totalSumOfMaterials * 0.30) * hoursRequired;
        double finalSum = totalSumOfMaterials + workersPay;

        System.out.println(finalSum);
    }
}
