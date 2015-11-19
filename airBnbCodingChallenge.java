/**
 * filename    airBnbCodingChallenge.java
 * @author     Sharvari Barve
 * 
 * Problem is
 * Find the minimum number of operations required to convert a string into a palindrome. A palindrome is a word that reads the same forwards and reversed. Some examples are "civic",  "kayak", "radar", "solos".
Rules:
all characters are lower case
a letter can be reduced by decrementing its value
a letter can only be reduce, not increased
reducing letter 'a' will wrap to letter 'z'
the reduction in the value of any letter is counted as a single operation
Examples:
"abc" , palindrome = "aba"-> 2
"belong", palindrome = "belleb" -> 17
"anywhere", palindrome = "anywwyna"-> 25
"airbnb", palindrome = "airria"-> 16
 * 
 * 
 *Calulate minimum operations to convert a string to palindrome
 *
 */
import java.util.Scanner;

public class airBnbCodingChallenge {

static int findMin(int a ,int b)
{
	if(a<b)
	{
		return a;
	}
	else 
	{
		return b;
	}
}
	
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	String word=s.next();
	boolean palFlag=true;
	int palCount=0;

	for(int i=0;i<word.length()/2;i++)
	{
		//finds out the point at which the characters don't match
		if(word.charAt(i)!=word.charAt(word.length()-i-1))
		{
			palFlag=false;     
			//calculating minimum of the two operations which would work
			if(word.charAt(i)>word.charAt(word.length()-i-1))
					{
				        palCount=palCount+findMin(word.charAt(i)-word.charAt(word.length()-i-1),26+word.charAt(word.length()-i-1)-word.charAt(i));
					}
			else
			{
				palCount=palCount+findMin(word.charAt(word.length()-i-1)-word.charAt(i),26-word.charAt(i)+word.charAt(word.length()-i-1));
			}
			
			
			
		}
	}
	
	System.out.println(palCount);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
