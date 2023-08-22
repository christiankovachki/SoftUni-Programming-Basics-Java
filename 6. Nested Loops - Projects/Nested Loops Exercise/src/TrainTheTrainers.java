import java.util.Scanner;
public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double allGradesTotal = 0;
        int counter = 0;

        int numberOfJurors = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {

            double grade = 0;
            for (int i = 1; i <= numberOfJurors; i++) {
                counter++;
                grade += Double.parseDouble(scanner.nextLine());
            }

            allGradesTotal += grade;

            double avgGrade = grade / numberOfJurors;

            System.out.printf("%s - %.2f.\n", input, avgGrade);

            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", allGradesTotal / counter);

    }
}