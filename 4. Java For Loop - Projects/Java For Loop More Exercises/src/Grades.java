import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine()); // броят на студентите, явили се на изпит

        int failedStudents = 0;
        int avgStudents = 0;
        int aboveAvgStudents = 0;
        int topStudents = 0;

        double sumOfAllGrades = 0.0;

        for (int i = 0; i < studentsCount; i++) {
            double studentGrade = Double.parseDouble(scanner.nextLine()); // оценката от изпита на всеки един студент

            if (studentGrade >= 2.00 && studentGrade <= 2.99) {
                failedStudents++;
                sumOfAllGrades += studentGrade;
            } else if (studentGrade >= 3.00 && studentGrade <= 3.99) {
                avgStudents++;
                sumOfAllGrades += studentGrade;
            } else if (studentGrade >= 4.00 && studentGrade <= 4.99) {
                aboveAvgStudents++;
                sumOfAllGrades += studentGrade;
            } else if (studentGrade >= 5.00 && studentGrade <= 6.00) {
                topStudents++;
                sumOfAllGrades += studentGrade;
            }
        }

        int totalStudents = failedStudents + avgStudents + aboveAvgStudents + topStudents;
        double averageGrade = sumOfAllGrades / totalStudents;

        System.out.printf("Top students: %.2f%%\n", (topStudents * 1.0 / totalStudents) * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", (aboveAvgStudents * 1.0 / totalStudents) * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n",(avgStudents * 1.0 / totalStudents) * 100);
        System.out.printf("Fail: %.2f%%\n", (failedStudents * 1.0 / totalStudents) * 100);
        System.out.printf("Average: %.2f", averageGrade);

    }
}