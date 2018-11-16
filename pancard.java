import java.util.*;

class pancard
{
  public static int validatePAN(String s1)
  {
   int count=0;
    char c[]=s1.toCharArray();
    if(c.length==8)
    {
      for(int i=0;i<8;i++)
        {
           if(i<3||i==7)
           {
              if(c[i]>=65&&c[i]<=90)
                  count++;
              
           }
           else
            {
                if((c[i]>=48)&&(c[i]<=57))
                   count++;
             }
         }
