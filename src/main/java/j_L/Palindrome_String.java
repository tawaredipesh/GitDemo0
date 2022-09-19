package j_L;

public class Palindrome_String {

	public static void main(String[] args) 
	{
	  String org ="nayan";
	  String rev ="";
	  
	  for(int i=org.length()-1; i>=0; i--)
	  {
		 rev=rev + org.charAt(i);
	  }
	  System.out.println(org);
	  System.out.println(rev);
	  
	  if(org.equals(rev))
	  {
	     System.out.println("Given string is a Palindrome");
  	  }
	  else
	  {
		  System.out.println("Given string is not a Palindrome");
	  }
	}
    
}
