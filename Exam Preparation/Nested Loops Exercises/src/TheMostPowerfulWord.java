import java.util.Scanner;
public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mostPowerfulWord = "";
        int currentWordPoints = 0;
        int biggestPoints = Integer.MIN_VALUE;

        String input = scanner.nextLine();
        while (!input.equals("End of words")) {
            boolean isVowel = false;

            for (int i = 0; i < input.length(); i++) {
                char letter = input.charAt(i);

                if (i == 0) {
                    if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y') {
                        isVowel = true;
                    } else if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'Y') {
                        isVowel = true;
                    }
                }
                currentWordPoints += letter;
            }

            if (isVowel) {
                currentWordPoints = currentWordPoints * input.length();
            } else {
                currentWordPoints = currentWordPoints / input.length();
            }

            if (currentWordPoints > biggestPoints) {
                biggestPoints = currentWordPoints;
                mostPowerfulWord = input;
            }

            currentWordPoints = 0;
            input = scanner.nextLine();
        }

        System.out.printf("The most powerful word is %s - %d", mostPowerfulWord, biggestPoints);

    }
}