import java.util.Scanner;
public class example4{
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
   
   
    int a= sc.nextInt();
    int b= sc.nextInt();
    System.out.println("sum "+(a+b));
    System.out.println("subtract "+(a-b));
    System.out.println("product"+(a*b));
    System.out.println("division "+(a/b));
  }
}