import java.util.Scanner;
public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfFloors = Integer.parseInt(scanner.nextLine()); // броят на етажите
        int numberOfRooms = Integer.parseInt(scanner.nextLine()); // броят на стаите за ЕДИН етаж

        for (int floor = numberOfFloors; floor >= 1; floor--) {
            for (int room = 1; room <= numberOfRooms; room++) {

                if (numberOfFloors == 1) {
                    for (int apartment = 0; apartment < numberOfRooms; apartment++) {
                        System.out.printf("L%d%d ", floor, apartment);
                    }
                    break;
                } else {
                    if (floor == numberOfFloors) {
                        for (int apartment = 0; apartment < numberOfRooms; apartment++) {
                            System.out.printf("L%d%d ", floor, apartment);
                        }
                        System.out.println();
                        break;
                    }

                    if (floor % 2 == 0) {
                        for (int apartment = 0; apartment < numberOfRooms; apartment++) {
                            System.out.printf("O%d%d ", floor, apartment);
                        }
                        System.out.println();
                        break;
                    } else {
                        for (int apartment = 0; apartment < numberOfRooms; apartment++) {
                            System.out.printf("A%d%d ", floor, apartment);
                        }
                        System.out.println();
                        break;
                    }
                }
            }
        }
    }
}