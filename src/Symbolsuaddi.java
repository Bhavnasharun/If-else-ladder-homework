import java.sql.SQLOutput;
import java.util.Scanner;

public class Symbolsuaddi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number");//message will appear
        int number2 = scanner.nextInt();// for working out we can enter the number

        System.out.println("Enter the operation you want(+,_,*,/)");

        ch=scanner.next().charAt(0);
        if (ch =='+'){// means plush
            System.out.println("\n Addition of "+number1+"+"+number2+"="
                    +(number1+number2));// will do adding

    }else if (ch =='-'){
            System.out.println("Subtraction of "+number1+"-"+number2+"="
                    +(number1-number2));// will do subtraction
        }else if (ch =='/'){
            System.out.println("Division of"+number1+"/"+number2+"=");
        } else if (ch == '*') {
            System.out.println("Multiplication of"+number1+"*"+number2+"="
            +(number1*number2));// will do multiplication

        }else
            System.out.println("Operation is not availabe");
    }}
