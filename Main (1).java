import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String s=sc.nextLine();
UserMainCode.ValidateAge(s);
}
}
class UserMainCode
{
public static int ValidateAge(String s1)
{
Boolean b=true;
int ss = Integer.parseInt(s1);
if(ss<=21 && ss>=45)
{
System.out.println(b);
}
else
{
System.out.println("false");
}
}
return 0
}







