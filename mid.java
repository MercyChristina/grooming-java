import java.util.*;
class mid
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the input");
String ss=sc.nextLine();
int len=ss.length();
int tlen=(len/2);
if(tlen%2==0)
{
System.out.println(ss.charAt(tlen));
}
else if(tlen%2!=0)
{
System.out.println(ss.charAt(tlen)-1);
}

}
}

