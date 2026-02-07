import java.util.Scanner;

public class Main{
    static void Print1ton(int n){
    if(n==0){
        return;
    }
    Print1ton(n-1);
        System.out.print(n + " ");

}
public static void main (String[]args){
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        Print1ton(n);
        scan.close();

}
}