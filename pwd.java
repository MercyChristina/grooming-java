import java.util.*;
class pwd
{
  public static void main(String args[])
   {
     String s;
     System.out.println("enter the pwd");
     Scanner sc=new Scanner(System.in);
     s=sc.nextLine();
     char ch[]=s.tocharArray();
     int len=ch.length;
     int schar=0,UC=0,LC=0,num=0;
     for(int i=0;i<len;i++)
     {
      if(ch[i]==35||ch[i]==36|| ch[i]==64)
            schar++;
      if(ch[i]>=65&&ch[i]<=90)
            UC++; 
      if(ch[i]>=97&&ch[i]<=122)
            LC++;
         }
     




          System.out.println("Valid");
     else
           System.out.println("Invalid");          
   }
}
