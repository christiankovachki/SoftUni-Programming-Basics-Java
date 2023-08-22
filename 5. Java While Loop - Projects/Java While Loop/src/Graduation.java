import java.util.Scanner;
public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfStudent = scanner.nextLine();

        int gradeCounter = 1;
        double totalGrades = 0.00;

       while (gradeCounter <= 12) {
           double annualGrade = Double.parseDouble(scanner.nextLine());

           if (annualGrade >= 4.00) {
               gradeCounter++;
               totalGrades += annualGrade;
               continue;
           }

           if (annualGrade < 4.00) {
               totalGrades += annualGrade;
               System.out.printf("%s has been excluded at %d grade", nameOfStudent, gradeCounter);
               break;
           }
       }

       if (gradeCounter >= 12) {
           System.out.printf("%s graduated. Average grade: %.2f", nameOfStudent, (totalGrades / 12.0));
       }

    }
}