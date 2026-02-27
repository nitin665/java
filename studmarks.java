import java.util.Scanner;
class students{
  int sno;
  String name;
  int age;
   students(int s,String n,int a){
    sno=s;
    name=n;
    age=a;
   }}

class marks extends students{
  int mark1;
  int mark2;
  int mark3;
  int total;
  double avg;
  String result;
 marks(int s, String n, int a, int m1, int m2, int m3) {
   super(s, n, a);
    mark1=m1;
    mark2=m2;
    mark3=m3;
}

  void calculate(){
    total=mark1+mark2+mark3;
  }
  void average(){
  avg=total/3.0;
  }
  void res(){
    if (mark1>=40 && mark2>=40 && mark3>=40){
    result="pass";}
    else{
    result="fail";}
  }
    void disp(){
      System.out.println("roll number "+sno);
      System.out.println("name "+name);
      System.out.println("Age: " + age);
      System.out.println("total marks= "+total);
      System.out.println("Average= "+avg);
      System.out.println("result= "+result);
  }}
  public class studmarks{
    public static void main( String[] args){
      Scanner sc= new Scanner(System.in);
      int sno=sc.nextInt();
      String name=sc.next();
      int age=sc.nextInt();
      int mark1=sc.nextInt();
      int mark2=sc.nextInt();
      int mark3=sc.nextInt();
      marks s1=new marks(sno,name,age,mark1,mark2,mark3);
      s1.calculate();
      s1.res();
      s1.average();
      s1.disp();
    }}