import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double h = Double.parseDouble(scanner.nextLine()) * 100; // широчиниа в МЕТРИ и * 100, за да се превърнат в СМ
        double w = Double.parseDouble(scanner.nextLine()) * 100; // дължина в МЕТРИ и * 100, за да се превърнат в СМ

        int widthCalc = (int) ((w - 100) / 70);
        int heightCalc = (int) (h / 120);
        int numberOfSeats = (widthCalc * heightCalc) - 3;

        System.out.println(numberOfSeats);
    }

}
