import java.util.*;
public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String password = scanner.nextLine();
        String passwordInput = scanner.nextLine();

        while (!password.equals(passwordInput)) {
            passwordInput = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", name);

    }
}