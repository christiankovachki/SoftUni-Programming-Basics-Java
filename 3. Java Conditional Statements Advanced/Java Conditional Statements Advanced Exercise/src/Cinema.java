import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String projectionType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double profit = 0;

        if (projectionType.equals("Premiere")) {
            profit = rows * columns * 12.00;
        } else if (projectionType.equals("Normal")) {
            profit = rows * columns * 7.50;
        } else if (projectionType.equals("Discount")) {
            profit = rows * columns * 5.00;
        }

        System.out.printf("%.2f leva", profit);

    }
}