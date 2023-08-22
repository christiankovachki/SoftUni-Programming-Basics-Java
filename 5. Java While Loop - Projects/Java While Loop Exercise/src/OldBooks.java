import java.util.Scanner;
public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favBook = scanner.nextLine();
        String books = scanner.nextLine();

        int bookCounter = 0;

        while (!books.equals(favBook)) {
            if (books.equals("No More Books")) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", bookCounter);
                break;
            }

            books = scanner.nextLine();
            bookCounter++;
        }

        if (books.equals(favBook)) {
        System.out.printf("You checked %d books and found it.", bookCounter);
        }

    }
}