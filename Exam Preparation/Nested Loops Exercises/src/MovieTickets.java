import java.util.Scanner;
public class MovieTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aOne = Integer.parseInt(scanner.nextLine());
        int aTwo = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        String firstSymbol = "";
        int secondSymbol = 0;
        int thirdSymbol = 0;
        int fourthSymbol = 0;

        for (int i = aOne; i <= aTwo - 1; i++) {
            if (i % 2 != 0) {
                char symbol = (char) i;
                firstSymbol = String.valueOf(symbol);
                fourthSymbol = symbol;
            } else {
                continue;
            }
            for (int j = 1; j <= n - 1; j++) {
                secondSymbol = j;
                for (int k = 1; k <= n / 2 - 1; k++) {
                    thirdSymbol = k;
                    int sum = secondSymbol + thirdSymbol + fourthSymbol;

                    if (sum % 2 != 0) {
                        System.out.println(firstSymbol + "-" + secondSymbol + thirdSymbol + fourthSymbol);
                    }
                }
            }
        }
    }
}