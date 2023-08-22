import java.util.Scanner;
public class CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end ; j++) {
                for (int k = start; k <= end ; k++) {
                    for (int l = start; l <= end ; l++) {

                        boolean isFirstConValid = false;
                        boolean isSecondConValid = false;
                        boolean isThirdConValid = false;

                        if (i % 2 == 0 && l % 2 != 0) {
                            isFirstConValid = true;
                        } else if (i % 2 != 0 && l % 2 == 0) {
                            isFirstConValid = true;
                        }

                        if (i > l) {
                            isSecondConValid = true;
                        }

                        int sum = j + k;
                        if (sum % 2 == 0) {
                            isThirdConValid = true;
                        }

                        if (isFirstConValid && isSecondConValid && isThirdConValid) {
                            System.out.print(i + "" + j + "" + k + "" + l + " ");
                        }
                    }
                }
            }
        }
    }
}