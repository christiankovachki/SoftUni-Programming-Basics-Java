import java.util.Scanner;
public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menCount = Integer.parseInt(scanner.nextLine());
        int womenCount = Integer.parseInt(scanner.nextLine());
        int tablesCount = Integer.parseInt(scanner.nextLine());

        int datesCount = 0;
        boolean availableTables = true;

        for (int i = 1; i <= menCount; i++) {
            for (int j = 1; j <= womenCount; j++) {
                System.out.print("(" + i + " " + "<->" + " " + j + ")" + " ");
                datesCount++;

                if (datesCount == tablesCount) {
                    availableTables = false;
                    break;
                }
            }

            if (!availableTables) {
                break;
            }
        }
    }
}