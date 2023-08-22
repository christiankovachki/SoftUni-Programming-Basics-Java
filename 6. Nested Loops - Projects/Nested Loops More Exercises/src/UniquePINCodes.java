import java.util.Scanner;
public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumUpperLimit = Integer.parseInt(scanner.nextLine());
        int secNumUpperLimit = Integer.parseInt(scanner.nextLine());
        int thirdNumUpperLimit = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= firstNumUpperLimit; i++) {
            if (i % 2 != 0) {
                continue;
            }
            for (int j = 1; j <= secNumUpperLimit; j++) {
                if (j == 2 || j == 3 || j == 5 || j == 7) {
                    for (int k = 1; k <= thirdNumUpperLimit; k++) {
                        if (k % 2 == 0) {
                            System.out.print(i + " " + j + " " + k);
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}