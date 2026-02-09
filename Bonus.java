import java.util.Scanner;
class Bonus{
  public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    double salary=sc.nextDouble();
    double bonus;
    if (salary>=50000)
      bonus=salary*0.10;
    else if (salary>=30000)
      bonus=salary*0.07;
    else
      bonus=salary*0.05;
    System.out.println("bonus"+bonus);
  }}