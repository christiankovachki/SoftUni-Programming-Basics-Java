import java.util.Scanner;
public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int initialAvailableSpace = width * length * height;
        int finalAvailableSpace = 0;

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            int cartonsCount = Integer.parseInt(input);
            finalAvailableSpace += cartonsCount;

            if (finalAvailableSpace > initialAvailableSpace) {
                System.out.printf("No more free space! You need %d Cubic meters more.", finalAvailableSpace - initialAvailableSpace);
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("Done")) {
            System.out.printf("%d Cubic meters left.", initialAvailableSpace - finalAvailableSpace);
        }

    }
}