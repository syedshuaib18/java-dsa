import java.util.Scanner;
class school{
   
    void passorfail(int num){
        if (num<35){
            System.out.println("you have been  failed ");

        }
        else{
            System.out.println("you have been passed");
        }
        
    }
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your mark");
        int num=scan.nextInt();
        school obj1=new school();
        obj1.passorfail(num);

        
        
    }
}

System.out.println