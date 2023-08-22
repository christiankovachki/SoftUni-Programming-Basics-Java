import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfOpenTabs = Integer.parseInt(scanner.nextLine()); // Брой отворени табове в браузъра
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfOpenTabs; i++) {
            String website = scanner.nextLine();

            switch (website) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }

        if (salary > 0) {
            System.out.printf("%d", salary);
        }

    }
}