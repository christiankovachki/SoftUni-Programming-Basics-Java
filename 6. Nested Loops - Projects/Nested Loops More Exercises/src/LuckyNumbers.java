import java.util.Scanner;
public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9 ; j++) {
                for (int k = 1; k <= 9 ; k++) {
                    for (int l = 1; l <= 9 ; l++) {

                        boolean isFirstConValid = false;
                        boolean isSecondConValid = false;

                        int firstSum = i + j;
                        int secondSum = k + l;
                        if (firstSum == secondSum) {
                            isFirstConValid = true;
                        }

                        if (n % firstSum == 0) {
                            isSecondConValid = true;
                        }

                        if (isFirstConValid && isSecondConValid) {
                            System.out.print(i + "" + j + "" + k + "" + l + " ");
                        }
                    }
                }
            }
        }
    }
}