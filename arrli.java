import java.util.*;
class arrli
{
public static void main(String args[])
{
ArrayList <String>al1=new ArrayList();
al1.add("abc");
al1.add("def");
al1.add("ghi");

ArrayList<String> al2=new ArrayList();
al2.add("abc");
al2.add("def");
al2.add("ghi");

ArrayList<String> al3=new ArrayList();
for (String temp : al1)
al3.add(al2.contains(temp)? "true": "false");
System.out.println(al3);
}
}
