import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        double lev = input * 1.79549;

        System.out.println(lev);
    }
}
