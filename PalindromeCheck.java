package StringBufferBuilder;
/*
 * Write a Java program to check if a string is a palindrome.
 */
public class PalindromeCheck {
	public static void main(String args[])
	{
		        String input = "Madam"; 
		        String reversed = "";
		        for (int i = input.length() - 1; i >= 0; i--) {
		            reversed += input.charAt(i);
		        }

		        if (input.equals(reversed)) {
		            System.out.println(input + " is a palindrome.");
		        }
		        else 
		        {
		            System.out.println(input + " is not a palindrome.");
		        }
		    }
}


	


