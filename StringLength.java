package StringBufferBuilder;
/*
 * Write a Java program to find the length of a string without using .length().
 */

public class StringLength {
	    public static void main(String[] args) {
	        String input = "My Cutpie ...";
	        int length = 0;

	        char[] chars = input.toCharArray();

	        for (char c : chars) {
	            length++;
	        }

	        System.out.println("Input string: " + input);
	        System.out.println("Length of the string: " + length);
	    }
	}


	


