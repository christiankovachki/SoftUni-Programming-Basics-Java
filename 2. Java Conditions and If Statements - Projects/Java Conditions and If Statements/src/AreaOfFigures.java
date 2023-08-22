import java.util.Scanner;

public class AreaOfFigures {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();

        double area = 0.0;

        if (shape.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;
        } else if (shape.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
        } else if (shape.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = (Math.PI * (radius * radius)); // резултатът е в кв. м.
        } else if (shape.equals("triangle")) {
            double base = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = 0.5 * (base * height);
        }
        System.out.printf("%.3f", area);
    }
}