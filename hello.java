import java.util.Scanner;
class demo{
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary =scan.nextInt();
        System.out.println("Enter your age: ");

        int age =scan.nextInt();
      if(salary>=20000 || age<=25)
      {
        System.out.println("You are eligible for loan ");
      }
      int loan;
      while(true)
      {
        System.out.println("Enter your loan amount");
        loan=scan.nextInt();
      if (loan<50000){
        System.out.println("Your loan is approved");
      }
      else
      {
        System.out.println("the max loan amount is 50000, re-enter your loan amount");
      }
    }
  }
}