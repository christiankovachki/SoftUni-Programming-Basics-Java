import java.util.Scanner;
public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritedMoney = Double.parseDouble(scanner.nextLine()); // Наследените пари
        int theYearToLiveUpTo = Integer.parseInt(scanner.nextLine()); // Годината, до която трябва да живее (включително)

        double spentMoney = 0.0;
        int age = 18;

        for (int i = 1800; i <= theYearToLiveUpTo; i++) {

            if (i != 1800) {
                age++;
            }

            if (i % 2 == 0) {
                spentMoney += 12000.0;
            } else {
                spentMoney += 12000.0 + (50 * age);
            }
        }

        if (inheritedMoney >= spentMoney) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritedMoney - spentMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", spentMoney - inheritedMoney);
        }

    }
}