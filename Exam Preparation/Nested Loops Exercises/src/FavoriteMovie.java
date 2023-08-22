import java.util.Scanner;
public class FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int movieCounter = 0;
        int currentAscii = 0;
        int biggestAscii = Integer.MIN_VALUE;
        String bestMovie = "";

        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            String movie = input;

            movieCounter++;

            for (int i = 0; i < movie.length(); i++) {
                char letter = movie.charAt(i);

                currentAscii += letter;

                if (letter >= 'A' && letter <= 'Z'){
                    currentAscii -= movie.length();
                }

                if (letter >= 'a' && letter <= 'z') {
                    currentAscii -= movie.length() * 2;
                }
            }

            if (currentAscii > biggestAscii) {
                biggestAscii = currentAscii;
                bestMovie = input;
            }

            currentAscii = 0;

            if (movieCounter == 7) {
                System.out.println("The limit is reached.");
                break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("The best movie for you is %s with %d ASCII sum.\n", bestMovie, biggestAscii);

    }
}