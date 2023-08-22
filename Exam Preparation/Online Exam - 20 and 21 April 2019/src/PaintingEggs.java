import java.util.Scanner;
public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int batches = Integer.parseInt(scanner.nextLine());

        double income = 0;

        switch (size) {
            case "Large":
                if (color.equals("Red")) {
                    income = batches * 16;
                } else if (color.equals("Green")) {
                    income = batches * 12;
                } else if (color.equals("Yellow")) {
                    income = batches * 9;
                }
                break;
            case "Medium":
                if (color.equals("Red")) {
                    income = batches * 13;
                } else if (color.equals("Green")) {
                    income = batches * 9;
                } else if (color.equals("Yellow")) {
                    income = batches * 7;
                }
                break;
            case "Small":
                if (color.equals("Red")) {
                    income = batches * 9;
                } else if (color.equals("Green")) {
                    income = batches * 8;
                } else if (color.equals("Yellow")) {
                    income = batches * 5;
                }
                break;
        }

        double incomeAfterExpenses = income - (income * 0.35);
        System.out.printf("%.2f leva.", incomeAfterExpenses);

    }
}