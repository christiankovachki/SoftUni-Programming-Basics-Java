import java.util.Scanner;

public class RadsToDegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double rads = Double.parseDouble(scanner.nextLine());
        double degs = rads * 180 / Math.PI;

        System.out.println(degs);
    }
}
