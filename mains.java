package main;

import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the input");
String s=sc.nextLine();
int n1=sc.nextInt();
UserMainCode.repeatFirstThreeCharacters(s,n1);
}
}
class UserMainCode
{
public static int repeatFirstThreeCharacters(String s1,int n)
{
int len=s1.length();
if(len<3)
{
for(int i=1;i<=n;i++)
{
System.out.println(s1.substring(3));
}
}
else if(len>3)
{
for(int i=1;i<=n;i++)
{
System.out.println(s1.substring(3));
}
}
    return 0;
}
}


