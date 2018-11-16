import java.util.*;
class addsub
{
public static void main(String args[])
{
int n,i,t;
System.out.println("enter the input");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<n;i=i+2)
{
for(j=1;j++)
{
if(j%2!=0)
{
t=t+i;
}
else
{
t=t-i;
}
}
}
}
}