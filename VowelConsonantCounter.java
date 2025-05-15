package StringBufferBuilder;
/*
 * Write a Java program to count the number of vowels and consonants in a string.
 */

public class VowelConsonantCounter {
	public static void main(String args[])
	{
		        String input = "Welcome Home"; 
		        int vowels = 0;
		        int consonants = 0;

		        input = input.toLowerCase(); 

		        for (int i = 0; i < input.length(); i++)
		        {
		            char ch = input.charAt(i);

		            if (ch >= 'a' && ch <= 'z') {
		                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		                    vowels++ ;
		                } else
		                {
		                    consonants++;
		                }
		            }
		        }

		        System.out.println("Input string: " + input);
		        System.out.println("Number of vowels: " + vowels);
		        System.out.println("Number of consonants: " + consonants);
	}
}

	

	


