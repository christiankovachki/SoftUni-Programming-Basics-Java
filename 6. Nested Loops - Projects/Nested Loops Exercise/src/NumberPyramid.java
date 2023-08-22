import java.util.Scanner;
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean isEnough = false;
        int number = 1;

        for (int i = 1; i <= n; i++) { // rows
            for (int j = 1; j <= i; j++) { // cols
                System.out.print(number + " ");
                number++;
                if (number > n) {
                    isEnough = true;
                    break;
                }
            }
            if (isEnough) {
                break;
            }
            System.out.println();
        }
    }
}