

public class palindrome {
	 public static void main(String[] args)
	 {
		 String s="apple";
		 String s1="aba";
		 boolean flag=true;
		 for(int i=0;i<s1.length()/2;i++)
		 {
			 
			 if(s1.charAt(i)==(s1.charAt(s1.length()-i-1)))
			 {
				 System.out.println(s1.charAt(i));
			 }
			 else
			 {System.out.println(s1.charAt(i));
				 flag= false;
			 }
		 }
		 if(flag==true)
		 {
			 System.out.println("Palindrome");
		 }
		 else
		 {
			 System.out.println("Not a palindrome");
		 }
		 
		 
	 }

}
