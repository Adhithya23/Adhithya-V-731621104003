import java.util.Scanner;
public class Palindrome{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
String rev="";
      String str=sc.nextLine();
      int length=str.length();
      for(int i=length-1;i>=0;i--){
         rev=rev+str.charAt(i);
          }
      if(str.equals(rev)){
       System.out.println("Palindrome");
      }
else{
System.out.println("not Palindrome");
}
}
}
      
      