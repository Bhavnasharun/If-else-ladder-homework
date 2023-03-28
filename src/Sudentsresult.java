import java.util.Scanner;

public class Sudentsresult {
    public static void main(String[] args) {
        String name ;
        int roll, math, eng, scie; //you can write down subjects mark and roll number
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name");
        name = scanner.nextLine();

        System.out.print("Enter Roll Number");
        roll = scanner.nextInt();

        System.out.print("Enter mark in Maths, eng, scie");
        math = scanner.nextInt();
        eng = scanner.nextInt();
        scie = scanner.nextInt();

         int total= math+eng+scie;
         float perc = (float) total/300*100;

         System.out.println("Roll Number:" +roll);
         System.out.println("Marks (Maths, eng, scie)");
         System.out.println("Total:"+total+"\t perc:" + "perc");


    }

}
