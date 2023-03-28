import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

        System.out.println("check if number is positive negative or zero");
        int number = scanner.nextInt();//enter the nuber
        if(number>0){
            System.out.println(number + "is POSITIVE NUMBER");


        }
        else if (number < 0 ){// enter the nagative nuber
            System.out.println(number + "is NAGATIVE NUMBER");

        }
       else if (number == 0){//zero print out
    System.out.println(number + "Number is Zero");
        }



    }

 }
