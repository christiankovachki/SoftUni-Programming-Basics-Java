import java.util.Scanner;
public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine()); // периодът, за който трябва да се направят изчисленията

        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0; // пациенти, изпратени към други болници поради недостиг на лекари

        for (int i = 1; i <= period; i++) {
            int patientsCountPerDay = Integer.parseInt(scanner.nextLine()); // броят пациенти, които пристигат за преглед за текущия ден

            if (i % 3 == 0) { // всеки 3-ти ден, т.е. i = 3, 6, 9, 12, ...
                if (untreatedPatients > treatedPatients) {
                    doctors++;
                }
            }

            if (patientsCountPerDay <= doctors) {
                treatedPatients += patientsCountPerDay;
            } else {
                untreatedPatients += patientsCountPerDay - doctors;
                treatedPatients += doctors;
            }
        }

        System.out.printf("Treated patients: %d.\n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);

    }
}