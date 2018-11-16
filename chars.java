import java.util.*;
class chars
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the input");
String s,t=" ";
s=sc.nextLine();
int len=s.length();
char s1[]=s.toCharArray();
for(int i=0;i<len;i++)
{
int count=0;
 for(int j=0;j<len;j++)
   {
   if(s1[i]==s1[j])  
count++;
}
if(count==1)
t=t+s1[i];
}
System.out.println(t.length());
}
}



      
       
      
       
     
         
           
          
             
     
