import java.util.Scanner;
public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lastSector = scanner.nextLine();
        int firstSectorRows = Integer.parseInt(scanner.nextLine());
        int seatsCountOdd = Integer.parseInt(scanner.nextLine());

        char c = lastSector.charAt(0);
        int counter = 0;
        int originalSeatsCount = seatsCountOdd;

        for (char i = 'A'; i <= c; i++) {
            for (int j = 1; j <= firstSectorRows; j++) {
                if (j % 2 != 0) { // нечетен ред
                    seatsCountOdd = 96 + seatsCountOdd;
                    char cc = (char) seatsCountOdd;
                    for (char k = 97; k <= cc; k++) {
                        counter++;
                        System.out.printf("%s%d%s\n", i, j, k);
                    }
                } else {
                    seatsCountOdd = 96 + seatsCountOdd + 2;
                    char ccc = (char) seatsCountOdd;
                    for (char k = 97; k <= ccc; k++) {
                        counter++;
                        System.out.printf("%s%d%s\n", i, j, k);
                    }
                }
                seatsCountOdd = originalSeatsCount;
            }
            firstSectorRows++;
        }
        System.out.println(counter);
    }
}