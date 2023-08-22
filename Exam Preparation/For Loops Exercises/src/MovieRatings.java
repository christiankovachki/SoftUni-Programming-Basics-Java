import java.util.Scanner;
public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moviesCount = Integer.parseInt(scanner.nextLine());

        String biggestRatedMovie = "";
        double biggestRating = 0;
        String lowestRatedMovie = "";
        double lowestRating = 11;
        double totalRatings = 0;

        for (int i = 1; i <= moviesCount; i++) {
            String title = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());

            totalRatings += rating;

            if (rating > biggestRating) {
                biggestRatedMovie = title;
                biggestRating = rating;
            }

            if (lowestRating > rating) {
                lowestRatedMovie = title;
                lowestRating = rating;
            }

        }

        System.out.printf("%s is with highest rating: %.1f\n", biggestRatedMovie, biggestRating);
        System.out.printf("%s is with lowest rating: %.1f\n", lowestRatedMovie, lowestRating);
        System.out.printf("Average rating: %.1f\n", totalRatings / moviesCount);
    }
}