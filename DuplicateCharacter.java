package StringBufferBuilder;
/*
 * Write a Java program to find duplicate characters in a string.
 */
import java.util.HashMap;
import java.util.Map;
public class DuplicateCharacter {
	    public static void main(String[] args) {
	        String input = "programming";
	        input = input.toLowerCase();
	        Map<Character, Integer> charCount = new HashMap<>();

	        for (char ch : input.toCharArray()) {
	            if (Character.isLetter(ch)) { 
	                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
	            }
	        }

	        System.out.println("Duplicate characters in \"" + input + "\":");

	       
	        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times.");
	            }
	        }
	    }
	}


	


