package StringBufferBuilder;
/*
 * Write a Java program to count the number of words in a string. 
 */

public class WordCounter {
	    public static void main(String[] args) 
	    {
	        String input = "Java is a powerful programming language.";
	       
	        String[] words = input.trim().split("\\s+");

	        int wordCount = words.length;

	        System.out.println("Input string: \"" + input + "\"");
	        System.out.println("Number of words: " + wordCount);
	    }
	}



