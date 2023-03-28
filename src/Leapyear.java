import java.sql.SQLOutput;
import java.util.Scanner;

public class Leapyear {
    Scanner scanner = new Scanner(System.in);

    public void leapyer() {
        //find out year is leap year or not
        System.out.println("please enter year is in to find out leap year or not");
        // find out year leap year or not
        int year = scanner.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year+" is a leap year");
        }
        else {
            System.out.println(year+" is not a leap year");
    }
}

    public static void main(String[] args) {
        Leapyear leapyear = new Leapyear();
        leapyear.leapyer();
    }
}