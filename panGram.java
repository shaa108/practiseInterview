
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class panGram {

    public static void main(String[] args) {
   HashMap<String,Integer> noCount=new HashMap<String,Integer>();
        for(int i=65;i<91;i++)
      { noCount.put(Character.toString((char)i),0);
      }
        Scanner scanner=new Scanner(System.in);
        String lowerCase=scanner.nextLine();
        String sentence=lowerCase.toUpperCase();
        //System.out.println(sentence);
        char array[]=sentence.toCharArray();
        
   for(int k=0;k<array.length;k++)
       {
       noCount.put(array[k]+"",1);
      // System.out.println(array[k]);
   }
        int noPan=0;
        for(int s=65;s<91;s++)
            {
            if(noCount.get(Character.toString((char)s))!=1)
                {
                noPan=1;
            }
            
        }
        if(noPan==1)
            {
            System.out.println("no pangram");
        }
        else
            {
System.out.println("pangram");
        }
        
        
    }
}