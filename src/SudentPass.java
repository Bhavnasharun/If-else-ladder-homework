import java.util.Scanner;

public class SudentPass {
    public static void main(String[] args) {
        String name;
        int roll,math, eng, scie;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name");
        name =scanner.next();
        System.out.println("Enter Roll Numer");
        roll= scanner.nextInt();
        System.out.println("Enter mark of eng, math,scie");
        math= scanner.nextInt();
        eng= scanner.nextInt();
        scie= scanner.nextInt();
        int total=math+eng+scie;
        float perc = 3/100*total ;
        System.out.println("roll number:"+roll);
        System.out.println("Marks(math, eng, scie)");
        System.out.println("Total:"+total+"\t perc:"+"perc");
    if(math>=35 && scie>=35 && eng >=35){
        System.out.println("You are pass");}
    else if (perc>=80 && perc<=100) {
        System.out.println("Your gread is A+");

    } else if (perc >=60 && perc <= 80) {
        System.out.println("Your gread is A");

    } else if (perc>=50 && perc<=60) {
        System.out.println("Your gread is B");

    } else if (perc>=35 && perc<=50) {
        System.out.println("Your gread is C");

    }


    }
}
