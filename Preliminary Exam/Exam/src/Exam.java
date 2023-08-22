import java.util.Scanner;
public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());

        int lowestCount = 0;
        int lowCount = 0;
        int midCount = 0;
        int excellentCount = 0;

        double allGrades = 0;

        for (int i = 1; i <= studentsCount; i++) {
            double grade = Double.parseDouble(scanner.nextLine());

            allGrades += grade;

            if (grade >= 2.00 && grade <= 2.99) {
                lowestCount++;
            } else if (grade >= 3.00 && grade <= 3.99) {
                lowCount++;
            } else if (grade >= 4.00 && grade <= 4.99) {
                midCount++;
            } else if (grade >= 5.00 && grade <= 6.00) {
                excellentCount++;
            }
        }

        System.out.printf("Top students: %.2f%%\n", excellentCount * 1.0 / studentsCount * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", midCount * 1.0 / studentsCount * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", lowCount * 1.0 / studentsCount * 100);
        System.out.printf("Fail: %.2f%%\n", lowestCount * 1.0 / studentsCount * 100);
        System.out.printf("Average: %.2f\n", allGrades / studentsCount);
    }
}