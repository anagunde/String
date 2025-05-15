package StringBufferBuilder;
/*
Write a Java program to reverse a string.
 */

public class Reversestring {
	    public static void main(String[] args) {
	        String input = "Mayra";
	        String reversed = "";

	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed += input.charAt(i);
	        }

	        System.out.println("Original string: " + input);
	        System.out.println("Reversed string: " + reversed);
	    }
	}



