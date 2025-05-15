package StringBufferBuilder;
/*
 * Write a Java program to remove all white spaces from a string.
 */

public class RemoveWhiteSpaces {
	    public static void main(String[] args) {
	        String input = "  Java   Programming   Language  ";
	        String noSpaces = "";

	        for (int i = 0; i < input.length(); i++) 
	        {
	            char ch = input.charAt(i);

	            if (ch != ' ') 
	            {
	                noSpaces += ch;
	            }
	        }

	        System.out.println("Original string: \"" + input + "\"");
	        System.out.println("String without spaces: \"" + noSpaces + "\"");
	    }
	}



