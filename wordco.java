import java.util.*;
class wordco
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the input");
String s=sc.nextLine();
String[] ss=s.split(",");
int len=ss.length;
System.out.println(len);
}
}