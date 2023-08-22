import java.util.Scanner;
public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDays = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());

        double eatenFoodDog = 0;
        double eatenFoodCat = 0;
        double biscuits = 0;

        for (int i = 1; i <= numberOfDays; i++) {
            int dog = Integer.parseInt(scanner.nextLine());
            int cat = Integer.parseInt(scanner.nextLine());

            eatenFoodDog += dog;
            eatenFoodCat += cat;

            if (i % 3 == 0) {
                biscuits += (dog + cat) * 0.10;
            }
        }

        double totalEatenFood = eatenFoodDog + eatenFoodCat;
        System.out.printf("Total eaten biscuits: %.0fgr.\n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.\n", totalEatenFood / totalFood * 100);
        System.out.printf("%.2f%% eaten from the dog.\n", eatenFoodDog / totalEatenFood * 100);
        System.out.printf("%.2f%% eaten from the cat.\n", eatenFoodCat / totalEatenFood * 100);

    }
}