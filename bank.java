import java.util.Scanner;
class bankacc{
  int acno;
  String name;
  int bal;
  int dep;
  int wit;

  bankacc(int a,String n,int b, int d ,int w ){
    acno=a;
    name=n;
    bal=b;
    dep=d;
    wit=w;
  }
  void deposit(){
    bal=bal+dep;
  }
    void withdraw(){
    bal=bal-wit;
  }

  void disp(){
      System.out.println("account number "+acno);
      System.out.println("name "+name);
      System.out.println("balance"+bal);
  }}
  public class bank{
    public static void main( String[] args){
      Scanner sc= new Scanner(System.in);
      System.out.println("account number ");
      int acno=sc.nextInt();
      System.out.println("name");
      String name=sc.next();
      System.out.println("balance");
      int bal=sc.nextInt();
      System.out.println("deposit");
      int dep=sc.nextInt();
      System.out.println("withdrawal");
      int wit=sc.nextInt();
      bankacc s1=new bankacc(acno,name,bal,dep,wit);
      s1.deposit();
      s1.withdraw();
      s1.disp();
    }}