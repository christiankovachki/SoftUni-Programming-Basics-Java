import java.util.Scanner;

public class HousePainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine()); // височината на къщата
        double y = Double.parseDouble(scanner.nextLine()); // дължината на страничната стена
        double h = Double.parseDouble(scanner.nextLine()); // височината на триъгълната стена на прокрива

        // Изчисления за стените
        double sideWallArea = x * y; // площта в комбинация с прозорцрите
        double windowArea = 1.5 * 1.5;
        double bothSideWallsArea = (sideWallArea * 2) - (windowArea * 2); // това е площта, която ще се боядисва
        double door = 1.20 * 2.0;
        double backWall = x * x;
        double bothBackAndFrontArea = (2 * backWall) - door;
        double houseArea = bothSideWallsArea + bothBackAndFrontArea; // квадратни метра
        double reqGreenPaint = houseArea / 3.40;

        // Изчисления за покрив
        double bothRoofRectangles = 2 * (x * y);
        double bothRoofTriangles = 2 * ((x * h) / 2);
        double roofArea = bothRoofTriangles + bothRoofRectangles;
        double reqRedPaint = roofArea / 4.30;

        System.out.printf("%.2f%n", reqGreenPaint);
        System.out.printf("%.2f", reqRedPaint);

    }
}
