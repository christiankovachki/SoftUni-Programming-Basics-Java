import java.util.Scanner;
public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersCount = Integer.parseInt(scanner.nextLine());

        int pOne = 0;
        int pTwo = 0;
        int pThree = 0;
        int pFour = 0;
        int pFive = 0;

        for (int i = 0; i < numbersCount; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());

            if (numbers < 200) {
                pOne++;
            } else if (numbers < 400) {
                pTwo++;
            } else if (numbers < 600) {
                pThree++;
            } else if (numbers < 800) {
                pFour++;
            } else {
                pFive++;
            }
        }

        double total = pOne + pTwo + pThree + pFour + pFive;

        System.out.printf("%.2f%%\n", (pOne / total) * 100);
        System.out.printf("%.2f%%\n", (pTwo / total) * 100);
        System.out.printf("%.2f%%\n", (pThree / total) * 100);
        System.out.printf("%.2f%%\n", (pFour / total) * 100);
        System.out.printf("%.2f%%\n", (pFive / total) * 100);

    }
}