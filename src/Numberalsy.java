import java.util.Scanner;

public class Numberalsy {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        char ch;
        System.out.println("Enter a character");
        ch=kb.next().charAt(0);
        if (ch>='a'&& ch <= 'z') {
            System.out.println("alphabet");

        } else if (ch>='0' && ch<='9') {
            System.out.println("Digit");

        }
        else {
            System.out.println("Symbol");
        }
    }
}
