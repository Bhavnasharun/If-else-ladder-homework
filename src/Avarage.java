import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);//scan the object in a out and you can print
        System.out.println("Input first number:");//will print out
        int number1 = scanner.nextInt();// you can put number

        System.out.println("Input second number");//this on will ou message
        int number2 = scanner.nextInt();//you can put your number

        System.out.println("Input third number");
        int number3 = scanner.nextInt();

        System.out.println("Input fourth number ");
        int number4 = scanner.nextInt();

        System.out.println("input fifth number");
        int number5 = scanner.nextInt();

        System.out.println("Average of five numbers is :" + (number1 + number2 + number3 + number4 + number5 ) / 5);
        // print out the number of average



    }
}
