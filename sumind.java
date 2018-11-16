import java.util.*;
class sumind
{
public static int sumofsquares(int s1)
{
int s=0,r;//sum,rem
while(s1>0)
{
r=s1%10;
s1=s1/10;
s=s+(r*r);
}
return s;
}
}
class main
{
public static void main(String args[])
{
int n1,s2;//result
System.out.println("enter the input");
Scanner sc=new Scanner(System.in);
n1=sc.nextInt();
s2=sumind.sumofsquares(n1);
System.out.println(s2);
}
}