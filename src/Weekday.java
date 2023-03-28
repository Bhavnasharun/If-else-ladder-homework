import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int dayNUm;
       // public void dayofWeek() {
            System.out.println("please enter number (1 to 7):");
            int day = scanner.nextInt();
            if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Teusday");

            } else if (day == 3) {
                System.out.println("Wednes");

            } else if (day == 4) {
                System.out.println("Thursday");

            } else if (day == 5) {
                System.out.println("Friday");

            } else if (day== 6) {
                System.out.println("Saturday");

            } else if (day == 7) {
                 System.out.println("Sunday");

            } else {
                System.out.println("Invalid entery please put 1 to 7");
            }
        }
    }














