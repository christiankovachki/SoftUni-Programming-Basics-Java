import java.util.Scanner;
public class MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double actorsBudget = Double.parseDouble(scanner.nextLine());

        double salary = 0.00;

        String input = scanner.nextLine();
        while (!input.equals("ACTION")) {
            int nameLength = input.length();

            if (nameLength <= 15) {
                input = scanner.nextLine();
                salary = Double.parseDouble(input);
            } else {
                salary = actorsBudget * 0.20;
            }

            actorsBudget -= salary;

            if (actorsBudget < 0) {
                System.out.printf("We need %.2f leva for our actors.", Math.abs(actorsBudget));
                break;
            }

            input= scanner.nextLine();
        }

        if (input.equals("ACTION")) {
            System.out.printf("We are left with %.2f leva.", actorsBudget);
        }

    }
}