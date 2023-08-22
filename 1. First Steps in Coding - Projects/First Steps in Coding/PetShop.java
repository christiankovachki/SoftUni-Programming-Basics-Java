import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dogsFood = Integer.parseInt(scanner.nextLine());
        int catsFood = Integer.parseInt(scanner.nextLine());

        double priceOfDogsFood = dogsFood * 2.50;
        int priceOfCatsFoods = catsFood * 4;

        System.out.printf("%.1f lv.", priceOfDogsFood + priceOfCatsFoods);
    }
}

// Друго решение:

// import java.util.Scanner;
//
//public class PetShop {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        int dogsFood = Integer.parseInt(scanner.nextLine());
//        int catsFood = Integer.parseInt(scanner.nextLine());
//
//        double priceOfDogsFood = dogsFood * 2.50;
//        int priceOfCatsFoods = catsFood * 4;
//
//        System.out.println(priceOfCatsFoods+priceOfDogsFood + " lv.");
//    }
//}