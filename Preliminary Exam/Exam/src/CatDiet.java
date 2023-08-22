import java.util.Scanner;
public class CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatsPercentage = Integer.parseInt(scanner.nextLine());
        int proteinPercentage = Integer.parseInt(scanner.nextLine());
        int carbsPercentage = Integer.parseInt(scanner.nextLine());
        int totalCals = Integer.parseInt(scanner.nextLine());
        int waterPercentage = Integer.parseInt(scanner.nextLine());

        double totalGramsFats = (fatsPercentage * 1.0 / 100 * totalCals) / 9;
        double totalGramsProteins = (proteinPercentage * 1.0 / 100 * totalCals * 1.0) / 4;
        double totalGramsCarbs = (carbsPercentage * 1.0 / 100 * totalCals * 1.0) / 4;

        double totalGrams = totalGramsFats + totalGramsProteins + totalGramsCarbs;
        double calsPerGram = totalCals / totalGrams;

        double water = 100 - waterPercentage;
        double result = water / 100 * calsPerGram;

        System.out.printf("%.4f", result);
    }
}