package StringBufferBuilder;
/*
 * Write a Java program to replace all occurrences of a character with another.
 */

public class ReplaceCharacter {
	
	    public static void main(String[] args) {
	        String input = "Chocolate";
	        char oldChar = 'a';
	        char newChar = 'o';

	     
	        String result = input.replace(oldChar, newChar);

	        System.out.println("Original string: " + input);
	        System.out.println("After replacing '" + oldChar + "' with '" + newChar + "': " + result);
	    }
	}



