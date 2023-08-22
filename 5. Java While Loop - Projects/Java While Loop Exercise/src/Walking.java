import java.util.Scanner;
public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepsCount = 0;

        while (stepsCount < 10000) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                stepsCount += stepsToHome;
                break;
            }

            int steps = Integer.parseInt(input);
            stepsCount += steps;
        }

        if (stepsCount >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", stepsCount - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - stepsCount);
        }

    }
}