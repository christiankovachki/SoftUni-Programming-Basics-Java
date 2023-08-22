import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        int volume = length * width * height;
        double litres = volume / 1000.0d;
        double occSpace = percentage / 100.0;

        double reqLitres = litres * (1 - occSpace);

        System.out.println(reqLitres);
    }
}
