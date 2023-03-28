import java.util.Scanner;

public class Interchange {
    public static void main(String[] args) {


    int x,y,t;//x and y are to stop
    Scanner scanner = new Scanner(System.in);


   System.out.println("Enter the value of X and Y");
   x = scanner.nextInt();//real value
   y = scanner.nextInt();
   System.out.println("before swapping numbers:"+x+" "+y);
   t= x;// changed value
   x=y;// changed value
   y=t;
   System.out.println("After swapping:"+x+""+y);// out put
   System.out.println();


}}
