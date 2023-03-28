import java.util.Scanner;

public class EligibleVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("Please enter your age in in to valve");
        age=scanner.nextInt();
        if(age >= 18 ){
            System.out.println("You are eligible for vote"+age);

        }else{
            System.out.println("you are not eligible for vote"+age);
        }
    }
}
