import java.util.Scanner;
public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLetter = scanner.next().charAt(0);
        char secondLetter = scanner.next().charAt(0);
        char thirdLetter = scanner.next().charAt(0);

        int counter = 0;

        for (char i = firstLetter; i <= secondLetter; i++) {
            for (char j = firstLetter; j <= secondLetter; j++) {
                for (char k = firstLetter; k <= secondLetter; k++) {
                    if (i != thirdLetter && j != thirdLetter && k != thirdLetter) {
                        counter++;
                        System.out.printf("%s%s%s ", i, j, k);
                    }
                }
            }
        }
        System.out.printf("%d", counter);
    }
}