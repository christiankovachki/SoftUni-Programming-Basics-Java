import java.util.Scanner;
public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodInKilos = Integer.parseInt(scanner.nextLine()) * 1000; // умножаваме по 1000, за да превърнем от килограми в грамове

        int eatenFoodTotal = 0;

        String input = scanner.nextLine();
        while (!input.equals("Adopted")) {
            int eatenFood = Integer.parseInt(input); // колко грама изяжда кученцето на всяко хранене

            eatenFoodTotal += eatenFood;

            input = scanner.nextLine();
        }

        if (eatenFoodTotal <= foodInKilos) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInKilos - eatenFoodTotal);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", eatenFoodTotal - foodInKilos);
        }

    }
}