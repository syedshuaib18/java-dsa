import java.util.Random;
class demo{
    public static void main(String args[]){
        Random rand=new Random();
        int newnum = 0;
        while(newnum!=4){
            newnum= rand.nextInt(11);
            System.out.println(newnum);
        }
        
    }
}