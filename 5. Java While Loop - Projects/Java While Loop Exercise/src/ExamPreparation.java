import java.util.Scanner;
public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int unsatisfiedGrades = Integer.parseInt(scanner.nextLine());

        int assignmentsCount = 0;
        int poorGradesCount = 0;
        double sumOfGrades = 0.0;
        boolean isMarinDoingGood = false;
        String lastAssignment = "";

        while (poorGradesCount < unsatisfiedGrades) {
            String assignmentName = scanner.nextLine();
            if (assignmentName.equals("Enough")) {
                isMarinDoingGood = true;
                break;
            }

            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                poorGradesCount++;
            }

            assignmentsCount++;
            sumOfGrades += grade;
            lastAssignment = assignmentName;
        }

        if (isMarinDoingGood) {
            System.out.printf("Average score: %.2f\n", sumOfGrades / assignmentsCount);
            System.out.printf("Number of problems: %d\n", assignmentsCount);
            System.out.printf("Last problem: %s", lastAssignment);
        } else {
            System.out.printf("You need a break, %d poor grades.", poorGradesCount);
        }

    }
}