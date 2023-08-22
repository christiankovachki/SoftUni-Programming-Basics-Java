import java.util.Scanner;
public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeLength = Integer.parseInt(scanner.nextLine()); // дължина на тортата
        int cakeWidth = Integer.parseInt(scanner.nextLine()); // широчина на тортата

        int cakePieces = cakeLength * cakeWidth;

        while (cakePieces > 0) {
            String input = scanner.nextLine();

            if (input.equals("STOP")) {
                System.out.printf("%d pieces are left.", cakePieces);
                break;
            }

            int piecesOfCake = Integer.parseInt(input);
            cakePieces -= piecesOfCake;
        }

        if (cakePieces <= 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
        }

    }
}