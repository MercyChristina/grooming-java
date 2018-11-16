import java.util.*;
class pgs
{
  public static String extractSubString(String s1,int x,int y)
  {
    String t=" ";
    int len=s1.length();     
    char ch[]=s1.toCharArray();
    for(int i=len-x;i>(len-x-y);i--)
         t=t+c[i];
    return t;

  }
}

public class left
{
   public static void main(String[] args)
    {
       int n1,n2;
       String n,result;
       Scanner sc=new Scanner(System.in);
       n=sc.next();
       n1=sc.nextInt();
       n2=sc.nextInt();
       result=pgs.extractSubString(ip,n1,n2);
       System.out.println(res);
    }
}