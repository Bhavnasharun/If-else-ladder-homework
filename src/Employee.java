import java.util.Scanner;

public class Employee {
     private String employeid;
    private String empname;
    private int basicsalary, HRA, DA, GS, TA, PF ;
    public void read(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee id");
        employeid=scanner.next();
        System.out.println("Enter employee name");
        empname = scanner.next();
       System.out.println("Enter the basicsalary of an employee");
        basicsalary= scanner.nextInt();
       // calculate();
    }public void calculate(){


         HRA=basicsalary*10/100;

         DA=basicsalary*8/100;
         TA=basicsalary*9/100;
         PF=basicsalary*20/100;
         GS= basicsalary+HRA+TA+DA-PF;
     }
     public void display(){
         System.out.println("Employeeid: "+employeid );
         System.out.println("Emplyename: " +empname);
         System.out.println("Emplyebasic salary"+basicsalary);
         System.out.println("HRA :"+HRA);
         System.out.println("PF:"+PF);
         System.out.println("DA:"+DA);
         System.out.println("GS:"+GS);
         System.out.println("TA:"+TA);

                // "/n"+"Employename ":"+empname+
                // "/n"+" "+basiEmployee basic salary:yu7
         // salary+"/n"+"HRA:" +HRA+"/n"+"DA: "+DA+"/N"+GS+"/n"+"TA:"+TA+"/n"
        //+"PF : "+PF );

}
//class main{
    public static void main(String[] args) {
        Employee employeobj = new Employee();
        employeobj.read();
        employeobj.display();
        employeobj.calculate();

    }
}
