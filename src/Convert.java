import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        char ch,ch2;
        System.out.println("Enter any alphabet");//will enter the out put
        Scanner r =new Scanner(System.in);
        ch=r.next().charAt(0);//ch =a
        if(ch>='A' && ch<='Z'); //a>=A && a<=Z{
        ch2= Character.toLowerCase(ch);//for to do lower your character
        System.out.print("Lowercase "+ ch2);

    }

    }
