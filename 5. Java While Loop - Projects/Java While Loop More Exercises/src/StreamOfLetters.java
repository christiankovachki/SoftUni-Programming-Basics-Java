import java.util.Scanner;
public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int cCounter = 0;
        int oCounter = 0;
        int nCounter = 0;

        StringBuilder word = new StringBuilder();

        while (!input.equals("End")) {

            if (!input.matches("[a-zA-Z]+")) {
                input= scanner.nextLine();
                continue;
            }

            if (input.equals("c")) {
                cCounter++;
                if (cCounter == 1) {
                    input= scanner.nextLine();
                    continue;
                }
            } else if (input.equals("o")) {
                oCounter++;
                if (oCounter == 1) {
                    input= scanner.nextLine();
                    continue;
                }
            } else if (input.equals("n")) {
                nCounter++;
                if (nCounter == 1) {
                    input= scanner.nextLine();
                    continue;
                }
            }

            if (cCounter > 0 && oCounter > 0 && nCounter > 0) {
                cCounter = 0;
                oCounter = 0;
                nCounter = 0;
                word.append(" ");
            }
            word.append("").append(input);

            input= scanner.nextLine();
        }

        System.out.println(word);
        word.setLength(0);

    }
}