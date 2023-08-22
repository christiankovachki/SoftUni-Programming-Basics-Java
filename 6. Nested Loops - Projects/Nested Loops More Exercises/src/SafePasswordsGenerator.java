import java.util.Scanner;
public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());

        int passwordCounter = 0;

        for (char i = 35; i <= 55 ; i++) {
            for (char j = 64; j <= 96; j++) {
                for (int k = 1; k <= a; k++) {
                    for (int l = 1; l <= b; l++) {
                        for (char m = 64; m <= 96; m++) {
                            for (char n = 35; n <= 56; n++) {
                                System.out.printf("%s%s%d%d%s%s|", i, j, k, l, m, n);

                                if (k == a && l == b) {
                                    return;
                                }

                                passwordCounter++;

                                if (passwordCounter == max) {
                                    return;
                                }

                                i++;
                                j++;
                                m++;
                                l++;

                                if (l > b) {
                                    l = 1;
                                    k++;
                                    if (k > a) {
                                        k = 1;
                                    }
                                }

                                if (i > 55) {
                                    i = 35;
                                }
                                if (n == 55) {
                                    n = 35;
                                }
                                if (j > 96) {
                                    j = 64;
                                }
                                if (m > 96) {
                                    m = 64;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}