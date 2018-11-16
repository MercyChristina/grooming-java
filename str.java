import java.util.*;
class str
{
public static void main(String args[])
{
System.out.println("enter the string1");
System.out.println("enter the string2");
Scanner sc=new Scanner(System.in);
String m=sc.nextLine();
String n=sc.nextLine();
int lenm=m.length();
int lenn=n.length();
if(lenm==lenn)
{
System.out.println(m+n);
}
else if(lenm<lenn)
{
System.out.println(n.substring(lenn-lenm)+m);
}
else
{
System.out.println(m.substring(lenm-lenn)+n);
} 
}
}