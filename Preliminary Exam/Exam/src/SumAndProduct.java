import java.util.Scanner;
public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= i; j--) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 9; l >= k; l--) {

                        int sum = i + j + k + l;
                        int multiplication = i * j * k * l;

                        if (sum == multiplication && n % 10 == 5) {
                            System.out.printf("%d%d%d%d", i, j, k, l);
                            return;
                        } else if (multiplication / sum == 3 && n % 3 == 0) {
                            System.out.printf("%d%d%d%d", l, k, j, i);
                            return;
                        }

                    }
                }
            }
        }

        System.out.println("Nothing found");

    }
}