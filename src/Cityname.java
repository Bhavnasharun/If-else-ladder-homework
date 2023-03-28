import java.util.Scanner;

public class Cityname {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

char ch;
      String a ="Ahmdabad";
       String b = "bombay:" ;
       String c = "calcutta";
       String d = "delhi";
      String e = "elhabad";
       String f = "florida";
System.out.println("Enter a to f for City name ");
  String letter = scanner.next();
      // char=r.next().charAt(0);
  if (letter.equals("a")){
      System.out.println("Ahmdabad");// print out the name of city


        } else if (letter.equals("b")) {//if you not put a then its line will go next
      System.out.println("Bombay");
  } else if (letter.equals("c")) {
      System.out.println("Calacuta");//if you put c then will print city name

  } else if (letter.equals("d")) {
      System.out.println("delhi");

  } else if (letter.equals("e")) {
      System.out.println("elhabad");


  } else if (letter.equals("f")) {
      System.out.println("florida");

  }else {
      System.out.println("Invalid entry");// if you add something else so its will not
  }
    }


    }

