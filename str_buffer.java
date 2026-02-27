public class str_buffer{
  public static void main(String[]args){
    StringBuffer sb=new StringBuffer("Hello");
     System.out.println(sb.append("world"));
     System.out.println(sb.insert(1,"a"));
     System.out.println(sb.replace(0,4,"hi"));
     System.out.println(sb.delete(0,4));
     System.out.println(sb.reverse());
}}