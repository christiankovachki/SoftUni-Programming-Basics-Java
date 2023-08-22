import java.util.Scanner;
public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine(); // Име на актьор
        double points = Double.parseDouble(scanner.nextLine()); // Точки от академията
        int judges = Integer.parseInt(scanner.nextLine()); // Брой оценяващи

        double totalPoints = points + 0.0;

        for (int i = 0; i < judges; i++) {
            String judgeName = scanner.nextLine(); // Име на оценяващия
            double judgePoints = Double.parseDouble(scanner.nextLine()); // Точки от оценяващия

            totalPoints += (judgeName.length() * judgePoints) / 2;

            if (totalPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, totalPoints);
                break;
            }
        }

        if (totalPoints < 1250.5){
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - totalPoints);
        }
    }
}