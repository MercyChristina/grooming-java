
1.toggle 
import java.util.*;
public class tog1 {
    public static void main(String[] args) {
        String s="aB@Def$";
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(c[i])){
        System.out.println(Character.toUpperCase(c[i]));
        }
            else if(Character.isUpperCase(c[i])){
                System.out.println(Character.toLowerCase(c[i]));
            }
            else if(i==2)
                    {
                        System.out.println("@");}
                        else if(i==6){
                            System.out.println("$");
                                
}                        
}


output:
run:
A
B
c
$
D
e
F
BUILD SUCCESSFUL (total time: 0 seconds)


2.arrays
package arrind;


import java.util.*;
public class Arrind {
       public static int Index (int[] arr, int s) {
        if (arr==null)
            return -1;
        int l = arr.length;
        int i = 0;
        while (i < l) {
            if (arr[i] == s) 
                return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] arr = {1,5,6,3,4,1};
      System.out.println("Index position of 1 is: " + Index(arr, 1));
      System.out.println("Index position of 5 is: " + Index(arr, 5));
       }
}

OUTPUT
run:
Index position of 1 is: 0
Index position of 5 is: 1
BUILD SUCCESSFUL (total time: 0 seconds)
