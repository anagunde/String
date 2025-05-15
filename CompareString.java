package StringBufferBuilder;
/*
 * Write a Java program to compare two strings without using .equals() method.
 */

public class CompareString {
	    public static void main(String[] args) {
	        String str1 = "Python";
	        String str2 = "Python";

	        boolean isEqual = compareStrings(str1, str2);

	        if (isEqual) 
	        {
	            System.out.println("The strings are equal.");
	        } else
	        {
	            System.out.println("The strings are not equal.");
	        }
	    }

	    public static boolean compareStrings(String s1, String s2) {
	        
	        if (s1.length() != s2.length()) {
	            return false;
	        }

	     
	        for (int i = 0; i < s1.length(); i++) 
	        {
	            if (s1.charAt(i) != s2.charAt(i)) 
	            {
	                return false;
	            }
	        }

	        return true;
	    }
	}



