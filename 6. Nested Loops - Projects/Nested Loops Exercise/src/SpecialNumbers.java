import java.util.Scanner;
public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            for (int j = 1; j <= 1; j++) {
                
                int firstDigit = Integer.parseInt(Integer.toString(i).substring(0, 1));
                int secondDigit = Integer.parseInt(Integer.toString(i).substring(1, 2));
                int thirdDigit = Integer.parseInt(Integer.toString(i).substring(2, 3));
                int fourthDigit = Integer.parseInt(Integer.toString(i).substring(3, 4));

                if (firstDigit != 0 && secondDigit != 0 && thirdDigit != 0 && fourthDigit != 0) {
                    if (n % firstDigit == 0) {
                        if (n % secondDigit == 0) {
                            if (n % thirdDigit == 0) {
                                if (n % fourthDigit == 0) {
                                    System.out.print(i + " ");
                                }
                            }
                        }
                    }
                }

            }
        }
    }
}