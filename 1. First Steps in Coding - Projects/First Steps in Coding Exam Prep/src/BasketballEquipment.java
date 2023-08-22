import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int annualFee = Integer.parseInt(scanner.nextLine());

        double shoes = annualFee - (annualFee * 0.40);
        double outfit = shoes - (shoes * 0.20);
        double ball = outfit * 0.25;
        double accessories = ball * 0.20;

        double finalSum = annualFee + shoes + outfit + ball + accessories;

        System.out.println(finalSum);
    }
}
