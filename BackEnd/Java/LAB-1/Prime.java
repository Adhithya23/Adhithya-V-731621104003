import java.util.Scanner;
public class Prime{
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       if(n%2 == 0 && n%1==0){
          System.out.println("Prime");
        } 
       else{
          System.out.println("Not prime");
         }
    }
}
