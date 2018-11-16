import java.util.*;
class strs
{
public static void main(String args[])
{
System.out.println("enter the input");
Scanner sc=new Scanner(System.in);
String m,rev="";
m=sc.nextLine();
int len=m.length();
for(int i=len-1;i>=0;i--)
{
char n=m.charAt(i);
rev=rev+n;
}
System.out.println(rev);
if(rev.equals(m))
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}

