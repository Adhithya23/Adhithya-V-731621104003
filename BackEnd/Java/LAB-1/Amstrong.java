import java.util.Scanner;
public class Amstrong{
public static void main(String args[]){
int sum=0,temp,last;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
temp=n;
while(temp != 0){
last=temp%10;
sum=sum+(last*last*last);
temp=temp/10;
}
if(n == sum){
System.out.println(n+" is Amstrong number");
}
else{
System.out.println(n+" is not  a Amstrong number");
}
}
}
