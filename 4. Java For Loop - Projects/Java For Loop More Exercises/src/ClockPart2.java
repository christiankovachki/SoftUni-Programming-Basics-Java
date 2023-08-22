public class ClockPart2 {
    public static void main(String[] args) {

        for (int i = 0; i <= 23 ; i++) { // часове
            for (int j = 0; j <= 59 ; j++) { // минути
                for (int k = 0; k <= 59 ; k++) { // секунди
                    System.out.printf("%d : %d : %d\n", i, j, k);
                }
            }
        }

    }
}